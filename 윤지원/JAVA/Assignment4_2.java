import java.util.Scanner;

public class Assignment4_2 {
    public static void main (String[] args) throws Exception {
      Scanner sc = new Scanner(System.in);
      System.out.print("0~999 사이의 숫자를 입력하시오: ");
      int num = sc.nextInt();
      sc.close();

      int hundreds = 0;
      int tens = 0;
      int units = 0;
      int sum = 0;
      
      hundreds = num / 100;
      tens = (num / 10) % 10;
      units = num % 10;

      sum = hundreds + tens + units;
      System.out.printf("각 자릿수의 합: %d", sum);
    }
  }