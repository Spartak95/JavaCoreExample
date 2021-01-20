package referenace.type.example;

import java.lang.ref.SoftReference;

public class SoftRefDemo {
    public static void main(String[] args) {
        // counter ուժեղ հղում
        Counter counter = new Counter();
        // counter դառնում է փափուկ հղում
        SoftReference<Counter> weakReference = new SoftReference<>(counter);
        // garbage collector Counter տիպի օբյեկտին կջնջի
        // այն ժամանակ, երբ JVM-ին անհրաժեշտ է հիշողություն
        counter = null;
    }
}

