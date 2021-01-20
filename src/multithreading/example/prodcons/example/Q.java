package multithreading.example.prodcons.example;

public class Q {
    private int n;
    private boolean flag = false;

    public synchronized int get(){
        if (!flag){
            try {
                wait();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Ստացել է " + n);
        flag = false;
        notify();
        return n;
    }

    public synchronized void put(int n) {
        if (flag){
            try {
                wait();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Ուղարկվել է " + n);
        this.n = n;
        notify();
        flag = true;
    }
}
