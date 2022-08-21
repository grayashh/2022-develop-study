import java.util.Scanner;

class Account {
    private String owner;
    private long balance;

    public Account(String name, long balance){
        owner = name;
        this.balance = balance;
        System.out.println("Hello sir.");
    }
    public long deposit(long amount){
        if(amount>=0){
            balance += amount;
            System.out.println(amount+"won deposited.");
        }else{
            System.out.println("0이하의 값은 입금할 수 없습니다.");
        }
        return balance; 
    }
    public long withdraw(long amount){
        if(amount < 0){
            System.out.println("0 이하의 값은 출금할 수 없습니다.");
        }else if (balance<amount){
            System.out.println("잔고 부족으로 출금이 불가능합니다.");
        }else{
            balance -= amount;
            System.out.println(amount+"won withdrawaled.");
        }
        
        return balance;
    }
    public void showAccount(){
        System.out.println("owner : "+owner);
        System.out.println("balance : "+ balance);
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

}
public class accountTest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = sc.nextLine();
        System.out.print("What is your current balance?");
        long balance = sc.nextLong();
        Account a1 = new Account(name, balance); 
        a1.showAccount();
        System.out.print("How much will you deposit?");
        int in = sc.nextInt();
        System.out.print("How much will you mwithdrawal?");
        int out = sc.nextInt();
        System.out.println(a1.deposit(in));
        System.out.println(a1.withdraw(out));
        a1.showAccount();
        sc.close();
  
      }


}

