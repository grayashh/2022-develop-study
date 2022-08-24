// class Triangle {
//    double height;
//    double length;
//    public Triangle(double height, double length) {
//       this.height = height;
//       this.length = length;
//    } 
   
//    public double findArea() {
//       return height*length*0.5;
//    }

//    public boolean isSameArea(Triangle t) {
//       if (t.findArea()==findArea()) {
//          return true;
//       }else {
//          return false;
//       }
//    }
// }



// public class TriangleTest {
//    public static void main(String[] args) {
//       Triangle t1 = new Triangle(10.0, 5.0);
//       Triangle t2 = new Triangle(5.0, 10.0);
//       Triangle t3 = new Triangle(6.0, 8.0);
            
//       System.out.println(t1.findArea());
//       System.out.println(t1.isSameArea(t2));
//       System.out.println(t1.isSameArea(t3));
//    }
// }

// public class CarTest {
//    public static void main(String[] args) {
//       Car c1 = new Car("red");
//       Car c2 = new Car("blue");
//       Car c3 = new Car("red");   
      
//       System.out.printf("자동차 수: %d, 빨간색 자동차 수: %d" , Car.getNumberOfCar(), Car.getNumberOfRedCar());
//    }
// }

// class Car {
//    static int getNumberOfCar = 0;
//    static int getNumberOfRedCar = 0;

//    public Car(String color) {
//       getNumberOfCar++;

//       if (color =="red") {
//          getNumberOfRedCar++; 
//       }
//    }

//    static public int getNumberOfCar() {
//       return getNumberOfCar;
//    }
//    static public int getNumberOfRedCar() {
//       return getNumberOfRedCar;
//    }
// }

import java.util.Scanner;

class Account {
   private String owner;
   private long balance;
   Scanner in = new Scanner(System.in);

   
   public void owner() {
      System.out.println("이름을 입력하세요");
      String owner= in.next();
   }
   
   public void balance() {
      System.out.println("잔액을 입력하세요");
      balance = in.nextLong();
   }
   
   public void deposit() {
      long amount = 0;
      System.out.println("저축할 금액을 입력하세요");
      amount = in.nextLong();
      balance += amount;
   }
   
   public void withdraw() {
      long amount = 0;
      System.out.println("인출할 금액을 입력하세요");
      amount = in.nextLong();
      if (amount>balance) {
         System.out.println("잔고 부족!");
         withdraw();
      } else {
         balance-=amount;
      }
   }
   
   public void account() {
      String owner = getOwner();
      long balance = getBalance();
      System.out.printf("%s님의 잔액은 %d원입니다", owner, balance);
   }
   public String getOwner() {
      return owner;
   }
   
   public long getBalance() {
      return balance;
   }
}

public class AccountTest {
   public static void main(String[] args) throws Exception {
      Account MyAccount = new Account();

      MyAccount.owner();
      MyAccount.balance();
      MyAccount.deposit();
      MyAccount.withdraw();
      MyAccount.account();
   }
}