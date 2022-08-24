import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.io.*;

public class Assignment11_2 {
  public static void main(String[] args) throws IOException {
    File file = new File("sort.txt");
    FileWriter fw = new FileWriter(file);
    Scanner in = new Scanner(System.in);
    System.out.print("입력: ");
    String s = in.nextLine();
    StringTokenizer st = new StringTokenizer(s, " .");
    System.out.print("단어 개수: ");
    System.out.println(st.countTokens());
    String[] arr = new String[6];
    int idx = 0;
    while (st.hasMoreTokens()) {
      arr[idx] = st.nextToken();
      idx++;
    }
    Arrays.sort(arr);
    String arrayToString = Arrays.toString(arr);
    fw.write(arrayToString);
    fw.close();
    System.out.print("정렬된 토큰: ");
    System.out.print(arrayToString);
    in.close();
  }
}
