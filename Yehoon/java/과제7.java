// 1번
// import java.util.Scanner;

// public class App {
//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in);
//         int[] dig = new int[5];
//         for (int i = 0; i<=dig.length-1;i++ ) {
//             System.out.println("숫자를 입력하시오: ");
//             dig[i] = sc.nextInt();
//         }
//         for (int i = 0; i <=dig.length-1; i++) {
//             System.out.print(dig[i]);
//             System.out.print(" ");    
//         }
//         sc.close();
//     }
// }

// 2번
// public class App {
//     public static void main(String args[]) {
//         int[] coinUnit = {500, 100, 50, 10};
//         int money = 2680;
//         System.out.println("money="+money);
//         for(int i=0;i<coinUnit.length;i++) {
//             System.out.println(coinUnit[i]+"원: " + money/coinUnit[i] + "개");
//             money=coinUnit[i];
//         }
//     } 
// }


// 3번
import java.util.Arrays;
public class App {
    public static void main(String args[]) {
		int[] arr = new int[10];     
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int)(Math.random() * 5) + 1;
		}
		System.out.println(Arrays.toString(arr));

		int[] temp = new int[5];
		int count = 0;

		for(int i = 0; i < arr.length; i++){
			boolean flag = false;
			for(int j = 0; j < temp.length; j++){
				if(arr[i] == temp[j]){
					flag= true;
					System.out.println(Arrays.toString(temp));
				}
			}
			if(!flag){
				temp[count++] = arr[i];
			}
		}
		int[] result = new int[count];
		for(int i = 0; i < result.length; i++){
			result[i] = temp[i];
		}
		System.out.println(Arrays.toString(result));
    }
}



// 4번
// 정답:d,e
// // 이유: new int[5]{1,2,3,4,5}; 에서 이미 배열을 결정했기 때문에 [5]를 쓸 이유가 없다. 
// 배열의 크기를 정하는 시기는 배열을 초기화 할 때 이다.
// 5번
// 정답:2

// // 6번
// public class App {
//     public static void main(String args[]) {
//         int[][] num = new int[4][4];
//         num[0][0]=1; num[0][1]=2; num[0][2]=3; num[0][3]=4;
//         num[1][0]=5; num[1][1]=6; num[1][2]=7; num[1][3]=8;
//         num[2][0]=9; num[2][1]=10; num[2][2]=11; num[2][3]=12;
//         num[3][0]=13; num[3][1]=14; num[3][2]=15; num[3][3]=16;
//         for (int i=0; i<4;) {
//             for (int j=0; j<4;) {
//                 System.out.print(num[i][j]);
//                 j++;
//                 System.out.print(" ");
//             }
//             i++;
//             System.out.println("");
//         }
//     }
// }

