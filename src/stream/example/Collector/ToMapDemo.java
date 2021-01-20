package stream.example.Collector;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ToMapDemo {
    public static void main(String[] args) {
         ArrayList<Person> people = new ArrayList<>();
         people.add(new Person("Aram", 25));
         people.add(new Person("Arsen", 21));
         people.add(new Person("Tigran", 18));
         people.add(new Person("Karen", 24));

         Stream<Person> personStream = people.stream();

         Map<String, Integer> map = personStream.collect(Collectors.toMap(Person::getName, Person::getAge));

         for (Map.Entry<String, Integer> a: map.entrySet()) {
             System.out.println("key: " + a.getKey() + ", value: " + a.getValue());
         }
    }
}

