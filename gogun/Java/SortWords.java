import java.util.Scanner;
import java.util.Arrays;
import java.io.*;
import java.io.IOException;

public class SortWords {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("입력: ");
    String words = sc.nextLine();
    words = words.replace(".", "");
    String arr[] = words.split(" ");

    System.out.println("단어 개수: " + arr.length);

    Arrays.sort(arr);

    System.out.print("정렬된 토큰: ");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + ", ");
    }
    File file = new File("sort.txt");
    try {
    FileWriter fw = new FileWriter(file);
    for (int i = 0; i < arr.length; i++) {
      fw.write(arr[i] + ", ");
    }    
    fw.close();
    } catch (IOException e) {
      System.out.println(e.toString());
    }
    sc.close();
  }
}