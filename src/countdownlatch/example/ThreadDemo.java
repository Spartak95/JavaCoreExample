package countdownlatch.example;

import java.util.concurrent.CountDownLatch;

public class ThreadDemo extends Thread{
    private CountDownLatch cdl;

    public ThreadDemo(CountDownLatch cdl) {
        this.cdl = cdl;
        start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            cdl.countDown();
            System.out.println(i);
        }
    }
}
