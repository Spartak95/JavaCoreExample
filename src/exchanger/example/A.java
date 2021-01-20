package exchanger.example;

import java.util.concurrent.Exchanger;

public class A extends Thread {
    private Exchanger<String> exchanger;
    private String name;

    public A(Exchanger<String> exchanger, String name) {
        this.exchanger = exchanger;
        this.name = name;
        setName("A");
        start();
    }

    @Override
    public void run() {
        try {
            System.out.println(getName()  + " հոսքը ստանում է " + exchanger.exchange(name));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
