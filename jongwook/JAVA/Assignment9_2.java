public class Assignment9_2 {
  public static void main(String[] args) {
    Car c1 = new Car("red");
    Car c2 = new Car("blue");
    Car c3 = new Car("red");

    System.out.printf("자동차 수: %d, 빨간색 자동차 수: %d,", Car.getNumberOfCar(), Car.getNumberOfRedCar());
  }
}

class Car {
  static int getNumberOfRedCar = 0;
  static int getNumberOfCar = 0;

  public Car(String color) {
    getNumberOfCar++;

    if (color == "red") {
      getNumberOfRedCar++;
    }
  }

  static public int getNumberOfCar() {
    return getNumberOfCar;
  }

  static public int getNumberOfRedCar() {
    return getNumberOfRedCar;
  }
}