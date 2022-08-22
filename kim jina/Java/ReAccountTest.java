import java.util.Scanner;

class Account {
    static private String owner;
    static private long balance;
    static private long amount;
    static Scanner sc = new Scanner(System.in);


    public static String getOwner() {
        return owner;
    }
    public static long getBalance() {
        return balance;
    }
    public void owner() {
        System.out.println("예금주 성명을 입력하시오: ");
        owner = sc.next();
    }
    public void balance() {
        System.out.println("잔액을 입력하시오: ");
        balance = sc.nextLong();
    }
    public void deposit() {
        System.out.println("저축할 금액을 입력하시오: ");
        amount = sc.nextLong();
        balance += amount;
    }
    public void withdraw() { 
        System.out.println("인출할 금액을 입력하시오: ");
        amount = sc.nextLong();
        
        if (amount > balance)
            System.out.println("계좌 잔액이 부족합니다.");
        else 
            balance -= amount;
    

    }
    public void account() {
        String owner = getOwner();
        long balance = getBalance();
        System.out.printf("%s님, 계좌 잔액은 %d입니다.", owner, balance);
    }
}
public class ReAccountTest {
    public static void main(String[] args) throws Exception {
        Account a = new Account();

        a.owner();
        a.balance();
        a.deposit();
        a.withdraw();
        a.account();
    }
}
