package memory.model.example;

public class Thread_2 extends Thread{
    public Thread_2(String name) {
        setName(name);
        start();
    }

    @Override
    public void run() {
        int r2 = Value.B;
        Value.B = 1;
    }
}
