package atomic.example.noAtomic;

public class AtomicDemo {
    public static void main(String[] args) {
        MyThread thread = new MyThread("A");
        MyThread thread2 = new MyThread("B");
        try {
            thread.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int i = Shared.ai.intValue();
        System.out.println(i);
    }
}
