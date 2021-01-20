package phaser.example.example3;

import java.util.concurrent.Phaser;

public class MyPhaser extends Phaser {
    private int numPhaser;

    public MyPhaser(int phase, int parties) {
        super(phase);
        this.numPhaser = parties;
    }

    @Override
    protected boolean onAdvance(int phase, int registeredParties) {
        System.out.println(phase + " փուլը ավարտվել է\n");
        if (phase == numPhaser || registeredParties == 0){
            return true;
        }
        return false;
    }
}
