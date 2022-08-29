import java.io.*;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class SortTest {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    System.out.println("입력 :");
    String inputStr = sc.next();
    sc.close();
    String replaceStr = tr.replaceAll("\\p{Punct}", "");
    String[] array = replaceStr.split(" ");

    int length = array.length;
    System.out.println("단어 개수 :" + length);

    Arrays.sort(array);
    System.out.println("정렬된 토큰 : ");
    for(int i = 0; i < length; i++) {
      System.out.print(array[i] + ", ");
    }

    File file = new File("sort.txt");
    FileWriter fw = new FileWriter(file);
    for(int i = 0; i < length; i++) {
      fw.write(array[i] + ", ");
    };
    fw.close();
  }
}

