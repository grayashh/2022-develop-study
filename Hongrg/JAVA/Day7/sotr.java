import java.io.IOException;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class sotr {
  
  public static void main(String[]args) throws IOException{

    Scanner sc = new Scanner(System.in);
    System.out.println("입력 : ");
    String str = sc.nextLine();
    sc.close();

    str = str.replaceAll("[.]"," ");
    
    String[]arr = str.split(" ");

    int length = arr.length;
    System.out.printf("단어 개수 : %d%n",length);

    Arrays.sort(arr);
    System.out.print("정렬된 토큰 : ");
    for (int i = 0; i < arr.length; i++){
      System.out.print(arr[i] + ",");
    }
    File file = new File("sort.txt");
    FileWriter fw = new FileWriter(file);
    for (int a = 0; a < arr.length; a++){
      fw.write(arr[a] + ",");
    
    }
    fw.close();
  }
}