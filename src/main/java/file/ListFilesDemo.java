package file;

import java.io.File;

public class ListFilesDemo {
    public static void main(String[] args) {
        File dir = new File("./myDir");
        if(dir.isDirectory()){
            File[] subs = dir.listFiles();
            System.out.println("一共有"+subs.length+"个子项");
            for(File sub : subs){
                System.out.println(sub.getName());
            }
        }
    }
}
