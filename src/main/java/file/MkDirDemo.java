package file;

import java.io.File;

public class MkDirDemo {
    public static void main(String[] args) {
        File file = new File("xjr/1/2");
        if(!file.exists()){
            file.mkdirs();
            System.out.println("文件夹创建成功");
        }else {
            System.out.println("文件夹已存在");
        }
    }
}
