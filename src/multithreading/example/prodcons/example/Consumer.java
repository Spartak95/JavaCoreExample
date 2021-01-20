package multithreading.example.prodcons.example;

public class Consumer extends Thread{
    private Q q;
    private String name;

    public Consumer(Q q, String name) {
        this.q = q;
        this.name = name;
        setName(name);
        start();
    }

    @Override
    public void run() {
        while (true){
            q.get();
        }

    }
}
