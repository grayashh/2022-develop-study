import java.util.Arrays;

public class Assignment777 {
  public static void main(String[] args) {
    int[] arr = new int[10];
    for (int i =0; i < arr.length;i++){
      arr[i] = ((int)(Math.random()*5) + 1);
    }
    System.out.print(Arrays.toString(arr)+"->");

    int[] arr2 = new int[5];
    int plus = 0;
    for(int i = 0; i < arr.length; i++){
      boolean flag = true;
        for(int j = 0; j < arr2.length; j++){
        if(arr[i] == arr2[j]){
          flag = false;
        }
      }
      if(flag){
        arr2[plus++] = arr[i];
      }
    }
    int[] result = new int[plus];
    for(int i = 0; i < result.length; i++){
      result[i] = arr2[i];
    }
    System.out.println(Arrays.toString(result));
  }
}
