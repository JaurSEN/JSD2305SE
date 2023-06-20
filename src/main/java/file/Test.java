package file;

import java.io.File;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        File dir = new File("./myDir");
        dir.mkdirs();
        for(int i = 1;i <= 100;i++){
           File file = new File(dir,"test"+i+".txt");
            file.createNewFile();
        }
    }
}
