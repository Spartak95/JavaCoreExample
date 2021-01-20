package path.example;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("D:\\Web Design & Development\\Book\\Data Base\\database_book.pdf");
        Path path2 = Paths.get("Web Design & Development\\Book\\Data Base\\");
        System.out.println("getParent() - " + path.getParent());
        System.out.println("getRoot() - " + path.getRoot());
        System.out.println("toAbsolutePath() - " + path.toAbsolutePath());
        System.out.println("getNameCount() - " + path.getNameCount());
        System.out.println("getFileName() - " + path.getFileName());
        System.out.println("getFileSystem() - " + path.getFileSystem());
        System.out.println("getName() - " + path.getName(0));
        System.out.println("getNameCount - " + path.getNameCount());
        System.out.println("resolve() - " + path.resolve(path));
        System.out.println("resolve() - " + path.resolve(path2));
        System.out.println("isAbsolute() - " + path.isAbsolute());
        System.out.println("toFile() - " + path.toFile());
        Path path3 = path.subpath(0, 2);
        System.out.println("toAbsolutePath() - " + path3.toAbsolutePath());
    }
}
