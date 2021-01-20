package stream.example.Collector;

import java.util.Arrays;
import java.util.stream.Stream;

public class CollectDemo {
    public static void main(String[] args) {
         String[] array = {"Արամ", "Տիգրան", "Արսեն", "Կարեն", "Արթուր"};
         Stream<String> stream = Arrays.stream(array);
         Stream<String> stream2 = Arrays.stream(array).parallel();
         // հաջորդական տվյալների հոսքի դեպքում combiner ֆունկցիան չի գործում
         StringBuilder st = stream.collect(StringBuilder::new, (x, y) -> x.append(y), (x, y) -> x.append(", ").append(y));
         StringBuilder st2 = stream2.collect(StringBuilder::new, (x, y) -> x.append(y), (x, y) -> x.append(", ").append(y));
         System.out.println("Հաջորդական տվյալների հոսքի դեպքում: " + st.toString());
         System.out.println("Զուգահեռ տվյալների հոսքի դեպքում: " + st2.toString());
    }
}
