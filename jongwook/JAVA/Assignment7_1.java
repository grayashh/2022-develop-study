import java.util.Scanner;

public class Assignment7_1 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int[] arr = new int[5];
    for (int i = 0; i <= 4; i++) {
      arr[i] = in.nextInt();
    }
    in.close();
    for (int i = 0; i <= 4; i++) {
      System.out.println(arr[i]);
    }
  }
}
