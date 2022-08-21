public class Assignment7777 {
  public static void main(String[]args) {
    // int [][] arr = {{1, 2, 3, 4} , {5, 6, 7, 8} , {9, 10, 11, 12}, {13, 14, 15, 16} };
    int [][] arr = new int[4][4];

    arr[0][0] = 1;
    arr[0][1] = 2;
    arr[0][2] = 3;
    arr[0][3] = 4;

    arr[1][0] = 5;
    arr[1][1] = 6;
    arr[1][2] = 7;
    arr[1][3] = 8;

    arr[2][0] = 9;
    arr[2][1] = 10;
    arr[2][2] = 11;
    arr[2][3] = 12;

    arr[3][0] = 13;
    arr[3][1] = 14;
    arr[3][2] = 15;
    arr[3][3] = 16;

    for (int i = 0; i < arr.length; i++){
      int[] inArr = arr[i];
      for (int j = 0; j < arr.length; j++){
        System.out.print(inArr[j] + " ");
      }
      System.out.println("");
    }
  }
}
