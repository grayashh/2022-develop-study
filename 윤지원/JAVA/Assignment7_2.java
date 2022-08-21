public class Assignment7_2 {
    public static void main(String args[]) {
		// 큰 금액의 동전을 우선적으로 거슬러 줘야한다.
		int[] coinUnit = {500, 100, 50, 10};
		int money = 2680;
		System.out.println("money="+money);
		for (int i = 0; i < coinUnit.length; i++) {
            System.out.print(coinUnit[i] + "원 : " + money / coinUnit[i] + "개 / ");
            money = money % coinUnit[i];
        }
	}
}