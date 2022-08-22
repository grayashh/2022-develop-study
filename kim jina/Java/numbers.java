import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            System.out.print(numbers[i]);
            System.out.print(" ");
        } 
        sc.close();
        
    }
}
