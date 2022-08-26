class Shape {}

class Rectangle extends Shape {}

class Circle extends Shape {}

public class CastExceptionTest {
    public static void main(String[] args) throws Exception {
        Rectangle r = new Rectangle();
        Circle c = new Circle();
        casting(r);
    }
    static void casting(Shape s) {
        try {
            Circle c = (Circle) s;
            Rectangle r = (Rectangle) s;
        } catch(ClassCastException ex) {
            System.out.print("잘못된 다운 캐스팅을 하여 예외가 발생했습니다.");
        }
        
    }
}
