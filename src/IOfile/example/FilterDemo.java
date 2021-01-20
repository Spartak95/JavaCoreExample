package IOfile.example;

import java.io.File;
import java.io.FilenameFilter;

public class FilterDemo implements FilenameFilter {

    public FilterDemo() {
    }

    @Override
    public boolean accept(File dir, String name) {
        return name.startsWith("M");
    }
}
