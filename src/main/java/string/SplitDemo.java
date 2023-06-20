package string;

import java.util.Arrays;

public class SplitDemo {
    public static void main(String[] args) {
        String line = "abc123def456ghi789jkl";
        String[] arr = line.split("[0-9]+");
        System.out.println(Arrays.toString(arr));

        line = "a,,,,b,,c,d";
        arr = line.split("[,]+");
        System.out.println(Arrays.toString(arr));

        line = "https://cn.bing.com/search?q=%E6%80%8E%AF%B7Claude+api&FORM";
        arr = line.split("\\?");
        arr = arr[1].split("&");
        System.out.println(Arrays.toString(arr));
    }
}
