package exchanger.example;

import java.util.concurrent.Exchanger;

public class B extends Thread {
    private Exchanger<String> exchanger;
    private String name;

    public B(Exchanger<String> exchanger, String name) {
        this.exchanger = exchanger;
        this.name = name;
        setName("B");
        start();
    }

    @Override
    public void run() {
        try {
            System.out.println(getName() + " հոսքը ստանում է " + exchanger.exchange(name));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
