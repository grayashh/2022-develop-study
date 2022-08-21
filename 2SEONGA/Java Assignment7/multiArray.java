public class multiArray {
  public static void main(String args[]) {
  int[][] fourFourArray = new int[4][4];

  fourFourArray[0][0] = 1;
  fourFourArray[0][1] = 2;
  fourFourArray[0][2] = 3;
  fourFourArray[0][3] = 4;

  fourFourArray[1][0] = 5;
  fourFourArray[1][1] = 6;
  fourFourArray[1][2] = 7;
  fourFourArray[1][3] = 8;

  fourFourArray[2][0] = 9;
  fourFourArray[2][1] = 10;
  fourFourArray[2][2] = 11;
  fourFourArray[2][3] = 12;

  fourFourArray[3][0] = 13;
  fourFourArray[3][1] = 14;
  fourFourArray[3][2] = 15;
  fourFourArray[3][3] = 16;

    for (int x = 0; x < fourFourArray.length; x++) {
      int [] fourArray = fourFourArray[x];
      for (int y = 0; y < fourArray.length; y++) {
        System.out.print(fourArray[y] + " ");
      }
      System.out.println(" ");
    }
  }
}