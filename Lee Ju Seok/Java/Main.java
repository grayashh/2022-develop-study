import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.print("입력: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine(); 

        StringTokenizer st = new StringTokenizer(input);

        int count = st.countTokens();
        System.out.println("단어 개수: " + count); 

        String[] st_arrays = new String[count]; 
        for(int i =0; i<count; i++) { 
            st_arrays[i]=st.nextToken();
        }

        Arrays.sort(st_arrays); 

        System.out.print("정렬된 토큰: ");
        for (int i=0; i<count; i++) { 
            System.out.print(st_arrays[i] + ", ");
        }
        
        File file = new File("sort.txt");
        FileWriter fw = new FileWriter(file);
        for (int i=0; i<count; i++) {
            fw.write(st_arrays[i] + ", ");
        }

        fw.close();
    }
}