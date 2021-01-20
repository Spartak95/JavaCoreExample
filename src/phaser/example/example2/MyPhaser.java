package phaser.example.example2;

import java.util.concurrent.Phaser;

public class MyPhaser extends Phaser {
    private int numPhases;

    public MyPhaser(int parties, int phaseCount) {
        super(parties);
        numPhases = phaseCount;
    }

    @Override
    protected boolean onAdvance(int phase, int registeredParties) {
        System.out.println(phase + " փուլը ավարտվել է\n");
        if (phase == numPhases || registeredParties == 0){
            return true;
        }
        return false;
    }
}
