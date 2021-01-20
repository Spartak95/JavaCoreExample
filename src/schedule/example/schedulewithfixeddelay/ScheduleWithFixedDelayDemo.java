package schedule.example.schedulewithfixeddelay;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ScheduleWithFixedDelayDemo {
    private static int count = 0;

    public static void main(String[] args) {
        ScheduledExecutorService ses = Executors.newScheduledThreadPool(1);

        Runnable task1 = () -> {
            System.out.println("Առաջադրանքը սկսվեց");
            count++;
            System.out.println("count - " + count);
        };

        // 5 վարկյան սպասեցնում է առաջադրանքի կատարումը սկսելու համար և առաջադրանքի
        // ավարտից հետո 1 վայրկանը հետո սկսվում է նոր առաջադրանքի կատարումը
        ScheduledFuture<?> scheduledFuture = ses.scheduleWithFixedDelay(task1, 5, 3, TimeUnit.SECONDS);

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
