package deadlocksolution.example;

import java.util.concurrent.locks.ReentrantLock;

public class DeadLock implements Runnable {
    ReentrantLock lock = new ReentrantLock();
    A a = new A(lock);
    B b = new B(lock);
    public DeadLock(){
        Thread.currentThread().setName("Գլխավոր հոսքը");
        Thread t = new Thread(this, "Մրցակցող հոսք");
        t.start();
        a.foo(b);
    }
    @Override
    public void run() {
       b.bar(a);
    }
    public static void main(String[] args) {
       DeadLock deadLock = new DeadLock();
    }
}

