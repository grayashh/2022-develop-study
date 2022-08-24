class Car {
    private String color;
    static int NumberOfCar = 0;
    static int NumberOfRedCar = 0;

    public Car(String color) {
        this.color = color;
        NumberOfCar++;

        if (color.equals("red"))
            NumberOfRedCar++;
    }

    public static int getNumberOfCar() {
        return NumberOfCar;
    }
    
    public static int getNumberOfRedCar() {
        return NumberOfRedCar;
    }

}

public class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car("red");
        Car c2 = new Car("blue");
        Car c3 = new Car("red");

        System.out.printf("자동차 수: %d, 빨간색 자동차 수: %d", Car.getNumberOfCar(), Car.getNumberOfRedCar());
    }
}

