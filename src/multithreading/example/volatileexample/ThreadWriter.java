package multithreading.example.volatileexample;

public class ThreadWriter extends Thread{
    private Count count;
    public ThreadWriter(String name, Count count) {
        this.count = count;
        setName(name);
        start();
    }

    @Override
    public void run() {
        System.out.println(getName() + " հոսքը փոփոխում է count փոփոխականի արժին " + (count.item = 5));
    }
}
