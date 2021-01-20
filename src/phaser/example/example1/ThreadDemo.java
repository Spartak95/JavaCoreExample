package phaser.example.example1;

import java.util.concurrent.Phaser;

public class ThreadDemo extends Thread{
    private Phaser phaser;

    public ThreadDemo(Phaser phaser, String name) {
        this.phaser = phaser;
        phaser.register();
        setName(name);
        start();
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() +
                " հոսքը սպասում է " + phaser.getPhase() + " փուլի ավարտին");
        phaser.arriveAndAwaitAdvance();

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() +
                " հոսքը սպասում է " + phaser.getPhase() + " փուլի ավարտին");
        phaser.arriveAndDeregister();
    }
}
