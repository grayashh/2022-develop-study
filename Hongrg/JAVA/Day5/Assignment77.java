import java.util.Scanner;

public class Assignment77 {
  public static void main(String[]args){
    
    Scanner sc = new Scanner(System.in);

    int money = 0;
    System.out.println("거스름돈: ");
    money = sc.nextInt();
    sc.close();

    System.out.println("거스름돈 : " + money + "원");

    int[] coin = {500, 100, 50, 10};

    for(int i = 0; i < coin.length; i++){
	    System.out.println(coin[i] + "원 : " + money/coin[i] + "개");
    	  money = money % coin[i];
    }
  }
}
