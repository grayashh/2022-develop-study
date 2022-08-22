import java.util.ArrayList;
import java.util.Arrays;

public class Assignment7_3 {
  public static void main(String[] args) {
    ArrayList<Integer> arrayList = new ArrayList<>();
    int[] arr = new int[10];
    for (int i = 0; i < 10; i++) {
      arr[i] = (int) (Math.random() * 5) + 1;
    }
    System.out.print(Arrays.toString(arr));
    System.out.print(" -> ");

    for (int item : arr) {
      if (!arrayList.contains(item))
        arrayList.add(item);
    }
    System.out.println(arrayList);
  }

}
