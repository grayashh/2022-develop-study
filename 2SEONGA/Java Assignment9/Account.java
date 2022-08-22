import java.util.Scanner;

class Account {
    private String owner;
    private long balance;
    public int amount;
    
    public Account(String owner, long balance) {
        this.owner = owner;
        this.balance = balance;
        System.out.println(owner + "님, 반갑습니다.");
    }

    public String getOwner() {
        return owner;
    } 
    public long getBalance() {
        return balance;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
    public void setBalance(long balance) {
        this.balance = balance;
    }

    public long deposit(long amount) {
        balance += amount;
        System.out.println(amount + "원 입금되었습니다.");
        return balance;
    }

    // public long withdraw(long amount){
    //     balance -= amount;
    //     System.out.println(amount + "원 출금되었습니다.");
    //     return balance
    // }

    long withdraw(long amount) {
        if (amount < 0) {
            System.out.println("출금할 금액을 다시 입력해주세요.");
        } else if (balance < amount) {
            System.out.println("출금 상한 금액은 잔액까지 입니다.");
        } else {
            balance -= amount;
            System.out.println(amount + "원 출금되었습니다.");
        }
        return balance;
    }
    // private long ATM(long balance) {
	// 	if (balance < withdraw) {
	// 		System.out.println("인출 상한 금액은 잔액까지 입니다.");
	// 	}
	// 	return balance;
	// }
    public void showAccount(){
        System.out.println("성함 : " + owner);
        System.out.println("잔액 : " + balance);
    }
}

class AccountTest {
     public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("고객님의 성함을 입력하세요. : ");
            String owner = sc.nextLine();

            System.out.println("고객님의 잔액을 입력하세요. : ");
            long balance = sc.nextLong();
            
            Account account = new Account(owner, balance);
            account.showAccount();

            System.out.println("얼마를 입금할 것인가요?");
            int depositAmount = sc.nextInt();
            System.out.println(account.deposit(depositAmount));
            account.showAccount();

            System.out.println("얼마를 출금할 것인가요?");
            int withdrawAmount = sc.nextInt();
            System.out.println(account.withdraw(withdrawAmount));
            account.showAccount();
        }
    }
}
