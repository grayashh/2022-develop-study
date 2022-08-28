// class Shape {}

// class Rectangle extends Shape {}

// class Circle extends Shape {}

// public class CastExceptionTest {
//     public static void main(String[] args) {
//         Rectangle r = new Rectangle();
//         try{
//             casting(r);
//         } catch (ClassCastException e) {
//             System.out.println("casting 오류");
//         }
//     }
//     static void casting(Shape s) {
//     Circle c = (Circle) s;
//     }
// }

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.io.*;

public class App {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("입력");
        String l = sc.nextLine();
        
        StringTokenizer div = new StringTokenizer(l );
        System.out.printf("단어 개수: %d", div.countTokens());
        String[] tok_array = new String[div.countTokens()];
        int idx = 0;
        while (div.hasMoreTokens()) {
            tok_array[idx] = div.nextToken();
            idx++;
        }
        Arrays.sort(tok_array);
        String atString = Arrays.toString(tok_array);
        File file = new File("sort.txt");
        FileWriter f = new FileWriter(file);
        f.write(atString);
        f.close();
        System.out.println("");
        System.out.println("정렬된 토큰:"+ atString);
        sc.close();
    }
}