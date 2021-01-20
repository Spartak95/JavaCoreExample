package semaphore.example.IncDecExample;

import java.util.concurrent.Semaphore;

public class SemaphoreDemo {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1);
        IncThreadDemo t1 = new IncThreadDemo(semaphore, "A");
        DecThreadDemo t2 = new DecThreadDemo(semaphore, "B");
    }
}
