import java.util.Arrays;
import java.util.Scanner;

public class Assignment7 {
  // 1번 문제
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = new int[5];
    for (int i = 0; i < 5; i++) {
      arr[i] = sc.nextInt();
      System.out.print(arr[i] + " ");
    }
    sc.close();


    // 2번 문제
		// 큰 금액의 동전을 우선적으로 거슬러 줘야한다.
		int[] coinUnit = {500, 100, 50, 10};
		int money = 2680;
		System.out.println("money="+money);
		for(int i=0;i<coinUnit.length;i++) {

      System.out.println(coinUnit[i]+"원: "+money/coinUnit[i]);
      money = money%coinUnit[i];

			}


    // 3번 문제

//랜덤한 값 10개가 들어간 배열 생성
    arr = new int[10];
    for(int i = 0; i < arr.length; i++){
      arr[i] = (int)(Math.random() * 5) + 1; // 1부터 5까지
    }
    System.out.println(Arrays.toString(arr)); // 배열을 출력하기 위해서는 Arrays 클래스를 사용해야함

    //중복된 숫자 제거하기
    int[] temp = new int[5]; // 임시 배열 선언
    int index = 0;

    for(int i = 0; i < arr.length; i++){ // 배열 길이 만큼 반복
      boolean flag = false;
          for(int j = 0; j < temp.length; j++){ // 배열의 나머지 부분이 같은지 check
          if(arr[i] == temp[j]){
              flag = true;
            }
        }

        if(!flag){
          temp[index++] = arr[i] // index에 후위연산으로 같은 수가 없는걸 check 후 arr에 삽입
        }
    }

    System.out.println(Arrays.toString(temp));

    //배열 길이 맞춰주기
    int[] result = new int[index];
    for(int i = 0; i < result.length; i++){
      result[i] = temp[i];
    }

    System.out.println(Arrays.toString(result));

    // 4번 문재

    ⓐ int[] arr[];

    ⓑ int[] arr = {1,2,3,};

    ⓒ int[] arr = new int[5];

    ⓓ int[] arr = new int[5]{1,2,3,4,5};

    ⓔ int arr[5];

    ⓕ int[] arr[] = new int[3][];



    A. ⓓ, ⓔ

    ⓓ - int[] arr = new int[]{1,2,3,4,5}에서는 대괄호[]안에 배열의 크기를 지정할 수 없다. 

     괄호 {}안의 데이터의 개수에 따라 자동적으로 결정되기 때문이다.

    ⓔ int arr[5]; // 배열을 선언할 때는 배열의 크기를 지정할 수 없음.


    // 5번 문제
    A. 2

    // 6번 문제
    int[][] arr = new int[4][4];
	
    int num = 1;
    
    for (int row = 0; row < arr.length; row++) { //row는 행 (가로) col은 열 (세로)
      for (int col = 0; col < arr[row].length; col++) {
        arr[row][col] = num++;
        System.out.printf("%2d ", arr[row][col]);
      }
      System.out.println();
    }  

      }
}