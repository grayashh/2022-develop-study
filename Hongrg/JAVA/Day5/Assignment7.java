import java.util.Scanner;

public class Assignment7 {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a, b, c, d, e;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        e = sc.nextInt();

        sc.close();

        int[] scores = new int[5];

        scores[0] = a;
        scores[1] = b;
        scores[2] = c;
        scores[3] = d;
        scores[4] = e;

        for (int i=0; i<scores.length; i++){
            System.out.print(scores[i]+" ");
        }
    
        }
        
}