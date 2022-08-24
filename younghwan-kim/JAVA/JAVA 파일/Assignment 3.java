import java.util.Scanner;

public class ASSIGNMENT3 {
    public static void main(String[] args) throws Exception {
        System.out.println("섭씨온도를 입력하세요.");
        Scanner s = new Scanner(System.in);
        float C = s.nextInt();
        s.close();
        
        double F = C * 1.8 + 32.0 ;

        System.out.printf("화씨 %.1f도는 섭씨로 %.1f도 입니다.", F, C);
    }
}
