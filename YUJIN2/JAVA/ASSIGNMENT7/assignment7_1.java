import java.util.Scanner;

public class assignment7_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        for(int i=0; i<5; i++){
            int n = sc.nextInt();
            array[i] = n;
        }
        sc.close();
        System.out.println("-----------------------------");
        System.out.print("입력: ");
        for(int i=0; i<5; i++){
            System.out.print(array[i]+ " ");
        } 
        System.out.println();
        System.out.print("출력: ");
        for(int i=0; i<5; i++){
            System.out.print(array[i]+ " ");
        } 
    }
}
