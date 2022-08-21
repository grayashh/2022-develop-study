import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

public class Assignment7_3 {
  public static void main(String[] args) {
    Random rand = new Random();
    ArrayList<Integer> newNums = new ArrayList<>();
    int[] nums = new int[10];

    for (int i = 0; i < nums.length; i++) {
      nums[i] = rand.nextInt(5)+1;
    }

    for (int data : nums) {
      if (newNums.contains(data) == false) {
        newNums.add(data);
      }
    }

    System.out.print(Arrays.toString(nums) + " ->" + newNums);
  }
}
