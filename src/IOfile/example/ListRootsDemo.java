package IOfile.example;

import java.io.File;

public class ListRootsDemo {
    public static void main(String[] args) {
        File[] roots = File.listRoots();
        // listRoots() մեթոդը վերադարձնում է զանգված, որը պարունակում
        // է համակարգչում առկա լոկալ սկավառակների անուններին
        for (File f : roots) {
            System.out.println(f);
        }
    }
}
