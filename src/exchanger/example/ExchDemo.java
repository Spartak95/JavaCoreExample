package exchanger.example;

import java.util.concurrent.Exchanger;

public class ExchDemo {
    public static void main(String[] args) {
        Exchanger<String> exchanger = new Exchanger<>();
        A a = new A(exchanger, "Spartak");
        B b = new B(exchanger, "Gareginyan");
    }
}
