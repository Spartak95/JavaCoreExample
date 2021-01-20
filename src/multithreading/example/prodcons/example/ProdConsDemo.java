package multithreading.example.prodcons.example;

public class ProdConsDemo {
    public static void main(String[] args) {
        Q q = new Q();
        Producer producer = new Producer(q, "A");
        Consumer consumer = new Consumer(q, "B");
    }
}
