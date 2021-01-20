package multithreading.example.volatileexample;

public class ThreadReader extends Thread{
    private Count count;

    public ThreadReader(String name, Count count) {
        this.count = count;
        setName(name);
        start();
    }

    @Override
    public void run() {
        System.out.println(getName() + " հոսքը ընթերցում է փոփոխված արժեքին " + count.item);
    }
}
