class Car {
    private String colorOfCar;
    static double numberOfCar = 0;
    static double numberOfRedCar = 0;

    public Car(String colorOfCar) {
        this.colorOfCar = colorOfCar;
        numberOfCar++;

        if (colorOfCar.equals("red")){
            numberOfRedCar++;
        }
    }
    static public double getNumberOfCar() {
        return numberOfCar;
    }
    static public double getNumberOfRedCar() {
        return numberOfRedCar;
    }
}

public class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car("red");
        Car c2 = new Car("blue");
        Car c3 = new Car("red");
        
       System.out.printf("자동차 수 : %d, 빨간색 자동차 수: %d", Car.getNumberOfCar(), Car.getNumberOfRedCar());
    }
 } 