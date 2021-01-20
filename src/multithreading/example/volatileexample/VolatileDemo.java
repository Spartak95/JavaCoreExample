package multithreading.example.volatileexample;

public class VolatileDemo {
    public static void main(String[] args) {
        Count count = new Count();
        ThreadWriter threadWriter = new ThreadWriter("A", count);
        ThreadReader threadReader = new ThreadReader("B", count);

    }
}
