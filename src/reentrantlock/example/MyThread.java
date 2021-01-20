package reentrantlock.example;

import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread{
    private ReentrantLock lock;

    public MyThread(ReentrantLock lock, String name) {
        this.lock = lock;
        setName(name);
        start();
    }

    @Override
    public void run() {
        try {
            System.out.println(getName() + " հոսքը սպասում է արգելափակմանը");
            lock.lock();
            System.out.println("--------------------------");
            System.out.println(getName() + " հոսքը ստանում է արգելափակումը");
            Counter.count++;
            System.out.println(getName() + " հոսքը հաշիվին ավելացնում է մեկով - " + Counter.count);
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println(getName() + " հոսքը ազատում է արգելափակմանը");
            System.out.println("--------------------------");
            lock.unlock();
        }
    }
}
