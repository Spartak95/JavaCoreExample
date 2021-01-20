package atomic.example.isAtomic;

public class MyThread extends Thread {
    public MyThread(String name) {
        setName(name);
        start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            Shared.ai.incrementAndGet();
        }
    }
}
