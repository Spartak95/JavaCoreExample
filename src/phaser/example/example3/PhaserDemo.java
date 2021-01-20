package phaser.example.example3;

public class PhaserDemo {
    public static void main(String[] args) {
        MyPhaser phaser = new MyPhaser(1, 3);
        MyThread thread = new MyThread(phaser, "A");
        MyThread thread2 = new MyThread(phaser, "B");
        MyThread thread3 = new MyThread(phaser, "C");
        if (!phaser.isTerminated()){
            phaser.arriveAndDeregister();
        }
    }
}
