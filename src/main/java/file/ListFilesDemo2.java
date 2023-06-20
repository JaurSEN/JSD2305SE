package file;

import java.io.File;
import java.io.FileFilter;

public class ListFilesDemo2 {
    public static void main(String[] args) {
        File dir = new File(".");
        if (dir.isDirectory()){
            FileFilter filter = new FileFilter() {
                @Override
                public boolean accept(File file) {
                    String name = file.getName();
                    return name.contains("e");
                }
            };
            File[] subs = dir.listFiles(filter);
            System.out.println("一共有"+subs.length+"个子项");
            for(File sub : subs){
                System.out.println(sub.getName());
            }
        }
    }
}
