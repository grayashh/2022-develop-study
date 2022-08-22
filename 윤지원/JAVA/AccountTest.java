import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) throws Exception {
        Account ac = new Account();
        ac.inputOwner();
        ac.inputBalance();
        ac.inputDeposit();
        ac.inputWithdraw();
        ac.finalBalance();
    }
}

class Account {
    private String owner;
    private long balance;

    Scanner in = new Scanner(System.in);

    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
    public void setBalance(long balance) {
        this.balance = balance;
    }
    public void inputOwner() {
        System.out.print("계좌주의 성함을 입력해주십시오: ");
        owner = in.next();
        setOwner(owner);
    }
    public void inputBalance() {
        System.out.printf("%s님 계좌의 잔액을 입력해주십시오: ", owner);
        balance = in.nextLong();
        setBalance(balance);
    }
    public void inputDeposit() {
        System.out.print("입금할 금액을 입력해주십시오: ");
        long amount =  in.nextLong();
        deposit(amount);
    }
    public void inputWithdraw() {
        System.out.print("찾으실 금액을 입력해주십시오: ");
        long amount = in.nextLong();
        withdraw(amount);
    }

    public long deposit(long amount) {
        if (0 < amount) {
            balance += amount;
            System.out.printf("입금한 금액: %d, 입금 후 잔액: %d", amount, balance);
            System.out.println();
        } else {
            System.out.print("입금할 금액(0보다 큰 값)을 다시 입력하십시오.");
            System.out.println();
        }
        return balance;
    }

    // Assignment9_3
    // public long withdraw(long amount){
    //     balance -= amount;
    //     System.out.printf("찾으신 금액: %d, 출금 후 잔액: %d", amount, balance);
    // }

    // Assignment9_4
    public long withdraw(long amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.printf("찾으신 금액: %d, 출금 후 잔액: %d", amount, balance);
            System.out.println();
        } else if(amount > 0) {
                System.out.printf("인출 상한 금액은 %d입니다. 출금할 금액을 다시 입력하십시오.", balance);
                System.out.println();
        } else {
            System.out.print("출금할 금액(0보다 큰 값)을 다시 입력하십시오.");
            System.out.println();
        }
        return amount;
    }

    public void finalBalance() {
        System.out.printf("%s님 계좌의 잔금은 %d원 입니다.", owner, balance);
    }
}
