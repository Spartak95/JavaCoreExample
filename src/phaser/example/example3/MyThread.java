package phaser.example.example3;

import java.util.concurrent.Phaser;

public class MyThread extends Thread {
    private Phaser phaser;

    public MyThread(Phaser phaser, String name) {
        this.phaser = phaser;
        phaser.register();
        setName(name);
        start();
    }

    @Override
    public void run() {
        while (!phaser.isTerminated()){
            System.out.println(getName() + " հոսքը սկսում է " + phaser.getPhase() + " փուլի կատարումը");
            phaser.arriveAndAwaitAdvance();
            try {
                sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
