package countdownlatch.example;

import java.util.concurrent.CountDownLatch;
import java.util.function.BiPredicate;

public class CDLDemo {
    public static void main(String[] args) {
        CountDownLatch cdl = new CountDownLatch(5);
        ThreadDemo thread = new ThreadDemo(cdl);
        System.out.println("Գլխավոր հոսքը մեկնարկել է");
        try {
            System.out.println("Գլխավոր հոսքը սպասում է");
            cdl.await();
            System.out.println("Գլխավոր հոսքը ավարտել է սպասումը");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Գլխավոր հոսքը ավարտեց իր աշխատանքը");
        BiPredicate<Integer, Integer> predicate = (x, y) -> {
            return (x > 0 && x < 10) || (y > 0 && y <= 10);
        };
    }
}
