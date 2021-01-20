package semaphore.example.ProdConsExample;

import java.util.concurrent.Semaphore;

public class Producer extends Thread{
    private Semaphore semaphore;
    private Semaphore semaphore2;
    private Q q;
    private String name;

    public Producer(Semaphore semaphore, Semaphore semaphore2, Q q, String name) {
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
                semaphore2.acquire();
                q.put(i);
                semaphore.release();
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
