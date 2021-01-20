package home.work;

public class SqrtDemo {
    public static void main(String[] args) {
         int s = sqrt(17);
        System.out.println(s);
        System.out.println(Math.sqrt(0));
    }

    public static int sqrt(int input) {
        int a = 0;
        boolean flug = false;

        if (input == 0) {
            return 0;
        }

        if (input == 1) {
            return 1;
        }

        for (int i = 2; i < input; i++) {
            if (input == (i*i)){
                a = i;
                flug = false;
            } else {
               flug = true;
            }
        }

        if(flug) {
            for (int i = 0; i < input; i++) {
                if (input == (i * i)){
                    a = i;
                    return a;
                }
                input--;
            }
        }
        return a;
    }
}
