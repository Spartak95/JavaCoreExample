package schedule.example.scheduleatfixedrate;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ScheduleAtFixedRateDemo {
    private static int count = 0;

    public static void main(String[] args) {
        ScheduledExecutorService ses = Executors.newScheduledThreadPool(1);

        Runnable task1 = () -> {
            System.out.println("Առաջադրանքը սկսվեց");
            count++;
            System.out.println("count - " + count);
            System.out.println("Առաջադրանքը ավարտվեց");
        };

        // 5 վարկյան սպասեցնում է առաջադրանքի կատարումը սկսելու համար
        // և ամեն 1 վայրկանը մեկ առաջադրանքը կրկնվում է, բայց այս
        // մեթոդում հաշվի չի առնվում առաջադրանքի կատարման ժամանակը
        ScheduledFuture<?> scheduledFuture = ses.scheduleAtFixedRate(task1, 5, 1, TimeUnit.SECONDS);

        while (true) {
            System.out.println("count : " + count);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (count == 5) {
                System.out.println("Count is 5, cancel the scheduledFuture!");
                scheduledFuture.cancel(true);
                ses.shutdown();
                break;
            }
        }

    }
}
