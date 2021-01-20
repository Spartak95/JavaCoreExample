package phaser.example.example1;

import java.util.concurrent.Phaser;

public class PhaserDemo {
    public static void main(String[] args) {
        int curPhase;
        Phaser phaser = new Phaser(1);
        ThreadDemo thread = new ThreadDemo(phaser, "A");
        ThreadDemo thread2 = new ThreadDemo(phaser, "B");
        ThreadDemo thread3 = new ThreadDemo(phaser, "C");

        curPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Ավարտվել է " + curPhase + " փուլը");

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        curPhase = phaser.getPhase();
        phaser.arriveAndDeregister();
        System.out.println("Ավարտվել է " + curPhase + " փուլը");
        if (phaser.isTerminated()){
            System.out.println("Փուլի սինխրոնիզատորը ավարտվել է");
        }
    }
}
