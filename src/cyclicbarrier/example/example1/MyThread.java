package cyclicbarrier.example.example1;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class MyThread extends Thread{
    private CyclicBarrier barrier;
    private String name;

    public MyThread(CyclicBarrier barrier, String name) {
        this.barrier = barrier;
        this.name = name;
        setName(name);
        start();
    }

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " հոսքը հասել է խոնչնդոտին");
            System.out.println(Thread.currentThread().getName() + " - " + barrier.await());
            System.out.println(Thread.currentThread().getName() + " հոսքը հաղթահարել է խոնչնդոտին");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}
