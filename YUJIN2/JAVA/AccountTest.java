import java.util.Scanner;

class Account {
    private String owner;
    private long balance;

    public Account(String name, long balance){
        owner = name;
        this.balance = balance;
        System.out.println("안녕하세요.");
    } public String getOwner() {
        return owner;
    } public long getBalance() {
        return balance;
    } public void setOwner(String owner) {
        this.owner = owner;
    } public void setBalance(long balance) {
        this.balance = balance;
    } public long deposit(long amount){
        if(amount>=0){
            balance += amount;
            System.out.println(amount+"원 입금되었습니다.");
        }else{
            System.out.println("0이하의 값은 입금할 수 없습니다.");
        }
        return balance;
    } /* 3번
    *  public long withdraw(long amount){
    *   balance -= amount;
    *   System.out.println(amount+"원 인출되었습니다.");
    *   }
    */ public long withdraw(long amount) {
        if (amount < 0) {
            System.out.println("0 이하의 값은 출금할 수 없습니다.");
        } else if (balance < amount) {
            System.out.println(amount-balance+"원 부족합니다.");
            System.out.println("잔고 부족으로 출금이 불가능합니다.");
        } else {
            balance -= amount;
            System.out.println(amount + "원 출금되었습니다.");
        }
        return balance;
    } public void showAccount(){
        System.out.println("이름 : "+owner);
        System.out.println("잔고 : "+ balance);
    } public void exitAccount(){
        System.out.println("계좌를 종료합니다 안녕히계세요.");
        owner = " ";
        balance = 0;
    }
}




public class AccountTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("이름이 무엇인가요?");
        String name = sc.nextLine();
        System.out.print("현재 잔고는 얼마인가요?");
        long balance = sc.nextLong();
        Account a = new Account(name, balance);
        a.showAccount();
        System.out.print("얼마를 입금할 것인가요?");
        int in = sc.nextInt();
        System.out.println(a.deposit(in));
        a.showAccount();
        System.out.print("얼마를 출금할 것인가요?");
        int out = sc.nextInt();
        System.out.println(a.withdraw(out));
        a.showAccount();
        sc.close();
        a.exitAccount();

    }
}