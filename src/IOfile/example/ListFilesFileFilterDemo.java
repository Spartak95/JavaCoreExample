package IOfile.example;

import java.io.File;
import java.io.FileFilter;

public class ListFilesFileFilterDemo implements FileFilter {
    public static void main(String[] args) {
         File file = new File("D:/Music");
         File[] file2 = file.listFiles(new ListFilesFileFilterDemo());
         for (int i = 0; i < file2.length; i++) {
             System.out.println(file2[i]);
         }
    }

    @Override
    public boolean accept(File pathname) {
        return pathname.getName().equals("Mixed");
    }
}
