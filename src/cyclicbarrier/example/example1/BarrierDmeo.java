package cyclicbarrier.example.example1;

import java.util.concurrent.CyclicBarrier;

public class BarrierDmeo {
    public static void main(String[] args) {
        CyclicBarrier barrier = new CyclicBarrier(3);
        MyThread thread = new MyThread(barrier, "A");
        MyThread thread2 = new MyThread(barrier, "B");
        MyThread thread3 = new MyThread(barrier, "C");
        // CyclicBarrier տիպի օբյեկտում նշված քանակի
        // կամ կրկնակի քանակի պետք է լինել հոսքերը
        //MyThread thread4 = new MyThread(barrier, "D");
        //MyThread thread5 = new MyThread(barrier, "E");
        //MyThread thread6 = new MyThread(barrier, "F");
    }
}
