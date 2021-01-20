package semaphore.example.ProdConsExample;

import java.util.concurrent.Semaphore;

public class Consumer extends Thread{
    private Semaphore semaphore;
    private Semaphore semaphore2;
    private String name;
    private Q q;

    public Consumer(Semaphore semaphore, Semaphore semaphore2, Q q, String name) {
        this.semaphore = semaphore;
        this.semaphore2 = semaphore2;
        this.q = q;
        this.name = name;
        setName(name);
        start();
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 11; i++) {
                semaphore.acquire();
                q.get();
                semaphore2.release();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
