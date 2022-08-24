import java.io.FileWriter;
import java.util.Scanner;
import java.util.Arrays;
import java.io.File;
import java.io.IOException;
import java.io.BufferedWriter;

public class ArraysTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        String[] array = inputString.split(" ");
        Arrays.sort(array);
        System.out.println("단어 개수: "+array.length);
        System.out.print("정렬된 토큰: ");
        for(int i = 0; i< array.length; i++){
            System.out.print(array[i]);
        }
        System.out.println();
        File file = new File("C:\\sort.txt");
        try (
                BufferedWriter bw = new BufferedWriter(new FileWriter(file))
        ) {
            for (int i = 0; i < array.length; i++) {
                bw.write(array[i]+' ');
            }
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

}
