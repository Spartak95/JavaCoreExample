package memory.model.example;

public class Thread_1 extends Thread{
    public Thread_1(String name) {
        setName(name);
        start();
    }

    @Override
    public void run() {
        int r1 = Value.A;
        Value.A = 1;
    }
}
