public class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car("red");
        Car c2 = new Car("blue");
        Car c3 = new Car("red");
       
        System.out.printf("자동차 수: %d, 빨간색 자동차 수: %d", 
        Car.getNumberOfCar(), Car.getNumberOfRedCar());
    }
 }
    class Car {
        private static int NumberOfCar;
        private static int NumberOfRedCar;
        private String color;

        public Car(String color) {
            this.color = color;
            NumberOfCar++;
            if (color == "red") {
                NumberOfRedCar++;
            }
        }
        public static int getNumberOfCar() {
            return NumberOfCar;
        }
        public static int getNumberOfRedCar() {
            return NumberOfRedCar;
        }
    }