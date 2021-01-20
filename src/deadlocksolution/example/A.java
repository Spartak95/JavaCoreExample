package deadlocksolution.example;

import java.util.concurrent.locks.ReentrantLock;

public class A {
    private ReentrantLock lock;

    public A(ReentrantLock lock) {
        this.lock = lock;
    }

    public void foo(B b) {
        String name = Thread.currentThread().getName();
        System.out.println(name + " մտավ A.foo() մեթոդի մեջ");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " փորձում է կանչել B.last() մեթոդը");
        b.last();

    }
    public void last(){
        lock.lock();
        System.out.println("A.last() մեթոդում");
        lock.unlock();
    }
}

