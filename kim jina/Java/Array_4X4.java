public class Array_4X4{
    public static void main(String args[]){
      int [][] arr = new int[4][4];
      
      int num = 1;
      for (int row = 0; row < arr.length; row++) {
        for (int col = 0; col < arr.length; col++) {
            arr[row][col] = num++;
            System.out.printf("%2d", arr[row][col]);
        }
        System.out.println();
      }
    }
  }
