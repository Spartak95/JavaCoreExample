package multithreading.example.doublecheck;

public class Lazy <T> {
    private volatile T value;
    T get() {
        if (value == null)
            value = null;
        return value;
    }

}
