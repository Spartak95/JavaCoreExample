package deadlocksolution.example;

import java.util.concurrent.locks.ReentrantLock;

public class B {
    private ReentrantLock lock;

    public B(ReentrantLock lock) {
        this.lock = lock;
    }

    public void bar(A a){
        String name = Thread.currentThread().getName();
        System.out.println(name + " մտավ B.bar() մեթոդի մեջ");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " փորձում է կանչել A.last() մեթոդը");
        a.last();
    }
    public void last(){
        lock.lock();
        System.out.println("B.last() մեթոդում");
        lock.unlock();
    }
}

