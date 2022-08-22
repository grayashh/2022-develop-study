class Car {
    static int carNum = 0;
    static int redCarNum = 0;
    String color;
    
    public Car(String color) {
        this.color = color;
        if (color == "red") {
            redCarNum++;
        }
        carNum++;
    }
    public static int getNumberOfCar() {
        return carNum;
    }
    public static int getNumberOfRedCar() {
        return redCarNum;
    }
}

public class Assignment9_2 {
    public static void main(String[] args) {
        Car c1 = new Car("red");
        Car c2 = new Car("blue");
        Car c3 = new Car("red");

        System.out.printf("자동차 수: %d, 빨간색 자동차 수: %d", 
        Car.getNumberOfCar(), Car.getNumberOfRedCar());
    }
}