package multithreading.example.prodcons.example;

public class Producer extends Thread{
    private Q q;
    private String name;

    public Producer(Q q, String name) {
        this.q = q;
        this.name = name;
        setName(name);
        start();
    }

    @Override
    public void run() {
        int i = 0;
        while (true){
            q.put(i++);
        }

    }
}
