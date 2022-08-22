import java.util.Scanner;

class Account {
  private String owner;
  private long balance;

  Account() { // default 생성자
  }

  Account(String owner) {
    this.owner = owner;
  }

  Account(long balance) {
    this.balance = balance;
  }

  Account(String owner, long balance) {
    this.owner = owner;
    this.balance = balance;
  }

  void setOwner(String owner) {
    this.owner = owner;
  }

  String getOwner() {
    return this.owner;
  }

  void setBalance(long balance) {
    this.balance = balance;
  }

  long getBalance() {
    return this.balance;
  }

  public long deposit(long amount) {
    // 인자인 금액을 저축하는 기능
    System.out.println(amount + "만큼 입금 합니다.");
    return this.balance += amount; // 저장
  }

  public long withdraw(long amount) {
    // 입력한 금액만큼 인출한 기능
    Scanner sc = new Scanner(System.in);
    long money = amount; // 새로운 money 변수를 선언
    System.out.println("현재 고객님은 " + this.balance + "원 까지 인출할 수 있습니다.");
    if (this.balance < amount) { // 현재 값이 입력 값보다 적다면
      System.out.println("잔액이 부족하여 인출하실 수 없습니다.");
      System.out.println("가진 금액을 모두 출금 하시겠습니까? y/n");
      String se[] = { "y", "n" };
      String sel = sc.next();
      sc.close();
      if (sel.equals(se[0])) {
        money = this.balance; // 현재 돈을 money값에 대입
      }
    }
    System.out.println(money + "만큼 인출 합니다.");
    return this.balance -= money; // money값
  }

  void show() {
    System.out.println(this.owner + "님은 현재 " + this.balance + "원을 가지고 있습니다.");
  }
}

public class Assignment9 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Account player = new Account(); // 생성자

    System.out.print("사용자 성함을 입력하세요 :");
    String owner = sc.next();
    player.setOwner(owner);
    System.out.print("사용자의 잔액은 얼만큼 있는지 적으세요. :");
    long balance = sc.nextLong();
    player.setBalance(balance);
    player.show();

    System.out.println("얼만큼 저축 하시겠습니까?");
    int amo = sc.nextInt();
    player.deposit(amo);
    player.show();

    System.out.println("얼마를 인출 하시겠습니까?");
    amo = sc.nextInt();
    player.withdraw(amo);
    player.show();

    sc.close();
  }

}