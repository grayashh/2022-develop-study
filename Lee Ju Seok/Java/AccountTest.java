import java.util.Scanner;

public class AccountTest {
	static private String owner;
	private long balance;

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	AccountTest() {
		owner = "이주석";
		balance=0;
	}

	AccountTest(String owner) {
		this.owner = owner;
	}

	AccountTest(long balance) {
		this.balance=balance;
	}

	AccountTest(String owner, long balance) {
		this.owner = owner;
		this.balance = balance;
	}

	public long deposit(long amount) { 
		this.balance += amount;
		return this.balance;
	}

	public long withdraw(long amount) {
		if(this.balance >= amount)
			this.balance -= amount;
		else
			System.out.printf("%s님, 잔액이 부족합니다.", owner);
		return this.balance;
	}
	public static void main(String[] args) {
		long amount;


		Scanner sc = new Scanner(System.in);
		AccountTest a = new AccountTest("이주석", 100000);


		System.out.print("출금할 금액을 입력해주세요 : ");
		amount = sc.nextLong();
		a.withdraw(amount);
		System.out.println("");
		System.out.print("예금할 금액을 입력해주세요 : ");
		amount = sc.nextLong();
		a.deposit(amount);
		System.out.printf("%d원을 예금합니다.", amount);
		System.out.println("");
		System.out.print("출금할 금액을 입력해주세요 : ");
		amount = sc.nextLong();
		a.withdraw(amount);
		System.out.printf("%d원을 출금합니다.", amount);
		System.out.println("");
		System.out.printf("잔액이 %d원 남았습니다.",a.getBalance());

		sc.close();
	}

}
