package phaser.example.example2;

import java.util.concurrent.Phaser;

public class ThreadDemo extends Thread {
    private Phaser phaser;

    public ThreadDemo(Phaser phaser, String name) {
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
               Thread.sleep(10);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }
    }
}
