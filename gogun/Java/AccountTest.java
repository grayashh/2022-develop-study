import java.util.Scanner;

public class AccountTest {
  public static void main(String[] args) {
    Account a = new Account();
    a.inputOwner();
    a.inputBalance();
    a.inputDepositAmount();
    a.inputWithdrawAmount();
    a.getBalance();
  }
}

class Account {
private String owner;
private long balance;
Scanner sc = new Scanner(System.in);

public Account() {}

public String getOwner() {
  return owner;
}
public long getBalance() {
  System.out.print("잔금 : " + balance);
  return balance;
}
public void setOwner(String owner) {
  this.owner = owner;
}
public void setBalance(long balance) {
  this.balance = balance;
}
public void inputOwner() {
  System.out.print("고객님의 이름을 입력해주세요: ");
  owner = sc.next();
  setOwner(owner);
}
public void inputBalance() {
  System.out.printf("%s님의 계좌 잔액을 입력해주세요: ", owner);
  balance = sc.nextLong();
  setBalance(balance);
}
public void inputDepositAmount() {
  System.out.printf("%s님, 얼마 입금하시겠어요?: ", owner);
  long amount = sc.nextLong();
  deposit(amount);
}

public void inputWithdrawAmount() {
  System.out.printf("%s님, 얼마 출금하시겠어요?: ", owner);
  long amount = sc.nextLong();
  withdraw(amount);
}

public long deposit(long amount) {
  if (amount < 0) {
    System.out.printf("입금할 금액은 0보다 커야 해요 %s님.", owner);
    System.out.print("\n");
  }
  else {
  balance += amount;
  System.out.printf("%d원 입금 완료!!  현재 잔액은 %d원입니다.", amount, balance);
  System.out.print("\n");
  }
  return balance;
}
// Assignment9 3번 문제
// public long withdraw(long amount) {
//   balance -= amount;
//   return balance;
// }

// Assignment9 4번 문제
public long withdraw(long amount) {
  if (amount > balance) {
    System.out.printf("잔액이 부족합니다. 해병 짜장이나 먹으시죠 %s님.", owner);
    System.out.print("\n");
  } else {
    if (amount < 0) {
      System.out.printf("출금할 금액은 0보다 커야 해요 %s님.", owner);
      System.out.print("\n");
    } else {
    balance -= amount;
    System.out.printf("%d원 출금 완료!!  현재 잔액은 %d원입니다.", amount, balance);
    System.out.print("\n");
    }
  }
  return balance;
}
}