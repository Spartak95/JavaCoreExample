package atomic.example.isAtomic;

import java.util.concurrent.atomic.AtomicInteger;

public class Shared {
    public static AtomicInteger ai = new AtomicInteger(0);
}
