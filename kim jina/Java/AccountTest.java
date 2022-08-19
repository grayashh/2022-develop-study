import java.util.Scanner;

class Account {
    static private String owner;
    static private long balance;
    Scanner sc = new Scanner(System.in); 

    public Account() {} //Account의 생성자 메소드

    public static String getOwner() {
        return owner;
    }
    public static long getBalance() {
        return balance;
    }
    public String owner() {
        System.out.println("예금주 성명을 입력하시오: ");
        owner = sc.next();
        return owner;
    }
    public void balance() {
        System.out.println("잔액을 입력하시오: ");
        balance = sc.nextLong();
    }
    public void deposit() {
        long amount = 0;
        System.out.println("저축할 금액을 입력하시오: ");
        amount = sc.nextLong();
        balance += amount;
    }
    public void withdraw() { 
        long amount = 0;
        System.out.println("인출할 금액을 입력하시오: ");
        amount = sc.nextLong();
        balance -= amount;
    }
    public void account() {
        String owner = getOwner();
        long balance = getBalance();
        System.out.printf("%s님, 계좌 잔액은 %d입니다.", owner, balance);
    }
}
public class AccountTest {
    public static void main(String[] args) throws Exception {
        Account a = new Account();

        a.owner();
        a.balance();
        a.deposit();
        a.withdraw();
        a.account();
    }
}
