package IOfile.example;

import java.io.File;
import java.util.Arrays;

public class ListDemo {
    public static void main(String[] args) {
         File file = new File("D:/Music/");
         // list() մեթոդի օգնությամբ ստանում
         // ենք ամբողջ թղթապանակի պարունակությանը
         String[] list = file.list();

         for (int i = 0; i < list.length; i++) {
             System.out.println(list[i]);
         }

         System.out.println(Arrays.toString(list));
    }
}
