package phaser.example.example2;

public class PhaserDemo {
    public static void main(String[] args) {
        MyPhaser phaser = new MyPhaser(1, 3);
        ThreadDemo thread = new ThreadDemo(phaser, "A");
        ThreadDemo thread2 = new ThreadDemo(phaser, "B");
        ThreadDemo thread3 = new ThreadDemo(phaser, "C");
        if (!phaser.isTerminated()){
            phaser.arriveAndDeregister();
        }
    }
}
