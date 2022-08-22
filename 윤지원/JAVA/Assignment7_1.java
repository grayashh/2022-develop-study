import java.util.Scanner;

public class Assignment7_1 {
    public static void main(String[] args) throws Exception {
        int[] fiveInts = new int[5];
        
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 5개를 입력하시오: ");
        for (int i = 0; i < fiveInts.length; i++) {
            fiveInts[i] = sc.nextInt();
        }
        
        for (int i = 0; i < fiveInts.length; i++) {
            System.out.print(fiveInts[i]);
            System.out.print(" ");
        }

        sc.close();
    }
}
