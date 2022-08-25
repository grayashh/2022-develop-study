class Shape {}

class Rectangle extends Shape {}

class Circle extends Shape {}

public class CastExceptionTest {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        casting(r);
    }

    static void casting(Shape s) {
        Circle c;
        try{
            c = (Circle) s;
        } catch(ClassCastException e){
            System.out.println("예외 발생 !");
        }
    }
}


