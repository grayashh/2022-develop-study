class Car{
    String color;
    static int carCount=0;
    static int redColorCarCount=0;
    public Car(String color){
        this.color =color;
        switch (this.color) {
            case "red":
                redColorCarCount ++;
                break;
        }
        carCount++;
    }
    public static int getNumberOfCar(){
        return carCount;
    }
    public static int getNumberOfRedCar(){
        return redColorCarCount;
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
