import java.util.Scanner; 

public class inputIntArray {
    public static void main(String[] args) throws Exception {
    try (Scanner sc = new Scanner(System.in)) {
        int int_0, int_1, int_2, int_3, int_4;

        int_0 = sc.nextInt();
        int_1 = sc.nextInt();
        int_2 = sc.nextInt();
        int_3 = sc.nextInt();
        int_4 = sc.nextInt();
        sc.close();
        
        int[] inputInt = new int[5];

        inputInt[0] = int_0;
        inputInt[1] = int_1;
        inputInt[2] = int_2;
        inputInt[3] = int_3;
        inputInt[4] = int_4;
            
        for (int i = 0; i < inputInt.length; i++) {            
            System.out.print(inputInt[i] + " ");
        }
    }
}
}

