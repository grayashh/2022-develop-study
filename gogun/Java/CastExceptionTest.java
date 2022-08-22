public class CastExceptionTest {
  public static void main(String[] args) {
    
    Rectangle r = new Rectangle();
    try {
    casting(r);
    }catch (ClassCastException exception) {
      System.out.println("업 캐스팅이 잘못되었습니다.");
    }
  }

  static void casting(Shape s) {
    Circle c = (Circle) s;
    }
  }



class Shape {}

class Rectangle extends Shape {}

class Circle extends Shape {}
