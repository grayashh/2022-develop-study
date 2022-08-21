import java.util.Scanner;

public class Assignment9_3 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Account account = new Account("노종욱", 0);
    System.out.print("저축할 금액을 입력해주세요: ");
    long saving = in.nextInt();
    account.deposit(saving);
    account.show();
    System.out.print("인출할 금액을 입력해주세요: ");
    long draw = in.nextInt();
    account.withdraw(draw);
    account.show();
    in.close();
  }
}

class Account {
  private String owner;
  private long balance;

  public Account(String name, long balance) {
    owner = name;
    this.balance = balance;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public String getOwner() {
    return owner;
  }

  public void setBalance(long balance) {
    this.balance = balance;
  }

  public long getBalance() {
    return balance;
  }

  public long deposit(long amount) {
    if (amount > 0) {
      this.balance = this.balance + amount;
    } else {
      System.out.println("올바른 값을 입력해주세요.");
    }
    return balance;

  }

  public long withdraw(long amount) {
    if (amount < 0) {
      System.out.println("올바른 값을 입력해주세요.");
    } else if (balance < amount) {
      System.out.println("잔고가 부족합니다.");
    } else {
      this.balance = this.balance - amount;
    }
    return this.balance;
  }

  public void show() {
    System.out.println("예금주: " + owner);
    System.out.println("통장잔고: " + balance);
  }
}
