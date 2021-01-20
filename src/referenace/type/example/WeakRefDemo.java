package referenace.type.example;

import java.lang.ref.WeakReference;

public class WeakRefDemo {
    public static void main(String[] args) {
        // counter ուժեղ հղում
        Counter counter = new Counter();
        // counter դառնում է թույլ հղում
        WeakReference<Counter> weakReference = new WeakReference<>(counter);
        // garbage collector առաջին, իսկ գործակման
        // դեպքում Counter տիպի օբյեկտը ջնջվում է
        counter = null;
    }
}

