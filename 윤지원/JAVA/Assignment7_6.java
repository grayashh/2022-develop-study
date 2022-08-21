public class Assignment7_6 {
    public static void main(String[] args) throws Exception {
        int[][] arr = new int[4][4];
        int num = 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = num;
                System.out.print(arr[i][j] + " ");
                num++;
            }
            System.out.println();
        }
    }
}
