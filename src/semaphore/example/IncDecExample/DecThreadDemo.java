package semaphore.example.IncDecExample;

import java.util.concurrent.Semaphore;

public class DecThreadDemo extends Thread{
    private Semaphore semaphore;
    private String name;

    public DecThreadDemo(Semaphore semaphore, String name) {
        this.semaphore = semaphore;
        this.name = name;
        setName(name);
        start();
    }

    @Override
    public void run() {
        try {
            semaphore.acquire();
            System.out.println("--------------");
            for (int i = 6; i > 0; i--) {
                Count.i = i;
                System.out.println(Thread.currentThread().getName() + " - " + Count.i);
            }
            System.out.println("--------------");
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
