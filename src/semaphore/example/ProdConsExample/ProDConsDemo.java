package semaphore.example.ProdConsExample;

import java.util.concurrent.Semaphore;

public class ProDConsDemo {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(0);
        Semaphore semaphore2 = new Semaphore(1);
        Q q = new Q();
        Producer producer = new Producer(semaphore, semaphore2, q, "A");
        Consumer consumer = new Consumer(semaphore, semaphore2, q, "B");
    }
}
