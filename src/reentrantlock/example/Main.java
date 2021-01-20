package reentrantlock.example;

import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        MyThread thread_1 = new MyThread(lock, "A");
        MyThread thread_2 = new MyThread(lock, "B");
    }
}
