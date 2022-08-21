public class Cartest {
  public static void main(String[] args) {
    Car c1 = new Car("red");
    Car c2 = new Car("blue");
    Car c3 = new Car("red");
    
    System.out.printf("자동차 수: %d, 빨간색 자동차 수: %d", 
    Car.getNumberOfCar(), Car.getNumberOfRedCar());
  }
}

class Car {
  static int CarNumber = 0;
  static int RedCarNumber = 0;
  String carColor;

  public Car(String c) {
    CarNumber++;
    carColor = c;
    if (carColor.equals("red")) {
      RedCarNumber++;
    }
  }

  public static int getNumberOfCar() {
    return CarNumber;
  }

  public static int getNumberOfRedCar() {
    return RedCarNumber;
  }
}