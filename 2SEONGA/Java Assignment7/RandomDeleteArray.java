import java.util.Random;
import java.util.Arrays;

public class RandomDeleteArray {
    public static int[] DeleteArray(int[] randomArray) {
        return Arrays.stream(randomArray).distinct().toArray();
    }
        public static void main(String[] args) throws Exception {
            Random randomInt = new Random();
            
            int [] randomArray = new int[10];

            for (int i = 0; i < randomArray.length; i++) {
                randomArray[i] = randomInt.nextInt(5)+1;
            }

            int[] Array = DeleteArray(randomArray);

            System.out.print(Arrays.toString(randomArray) + " -> " + Arrays.toString(Array));
        }
}