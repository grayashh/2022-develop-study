import java.util.Scanner;

public class Assignment4_3 {
    public static void main (String[] args) throws Exception {
      Scanner sc = new Scanner(System.in);
      System.out.print("전공 이수 학점: ");
      int majorCredit = sc.nextInt();

      System.out.print("교양 이수 학점: ");
      int cultureCredit = sc.nextInt();

      System.out.print("일반 이수 학점: ");
      int generalCredit = sc.nextInt();
      sc.close();
       
      int sum = majorCredit + cultureCredit + generalCredit;
      if (sum >= 140 & majorCredit >= 70 && cultureCredit >= 30 & generalCredit >= 30 | cultureCredit + generalCredit >= 80) {
        System.out.print("졸업 가능 여부: 졸업 가능");
      } else {
        System.out.print("졸업 가능 여부: 졸업 불가능");
      }
    }
  }