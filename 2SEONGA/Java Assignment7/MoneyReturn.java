public class MoneyReturn {
    public static void main(String args[]) {
		// 큰 금액의 동전을 우선적으로 거슬러 줘야한다.
		int[] coinUnit = {500, 100, 50, 10};
		int money = 2680;
		System.out.print("거스름돈 : " + money + "원");
		for (int i=0; i<coinUnit.length; i++) {
			int[] countCoinUnit = new int[4];
			if (money != 0) {
			countCoinUnit[i] = money / coinUnit[i];
			money = money - coinUnit[i] * countCoinUnit[i];
			}
		System.out.print(" / " + coinUnit[i] + "원 : " + countCoinUnit[i] + "개");
		} // main
	}
}
