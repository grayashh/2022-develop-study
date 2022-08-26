import java.util.Arrays;
import java.io.*;

public class ArrayTest {
    public static void main(String[] args) throws Exception {
        String str = "Empty vessels make the most sound.";
        str = str.replace(".","");
        String[] arr = str.split(" ");
        
        System.out.printf("입력: %s\n", str);
        System.out.printf("단어 개수: %d개\n",arr.length);
        System.out.print("정렬된 토큰: ");
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println("");
        File file = new File("sort.txt");
        FileWriter fw = new FileWriter(file);
        fw.write(Arrays.toString(arr));
        fw.close();

        FileReader fr = new FileReader(file);
        int ch = 0;
        System.out.print("파일 결과: ");
        while ((ch = fr.read()) != -1) {
            System.out.print((char) ch);
        }
        fr.close();
    }
}
