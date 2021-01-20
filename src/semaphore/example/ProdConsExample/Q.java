package semaphore.example.ProdConsExample;

public class Q {
    private  int count;

    public void get() {
        System.out.println(Thread.currentThread().getName() + " կատարող հոսքը ստացել է " + count +
                                            "\n-----------------------------");
    }

    public void put(int i){
        count = i;
        System.out.println(Thread.currentThread().getName() + " կատարող հոսքը ուղարկել է " + count +
                                            "\n-----------------------------");
    }
}
