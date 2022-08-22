public class CastExceptionTest {
  public static void main(String[] args) {
    
    Rectangle r = new Rectangle();
    try {
    casting(r);
    }catch (ClassCastException exception) {
      System.out.println("자식 클래스가 아닌 유형에 대한 참조를 캐스팅했습니다.");
    }
  }

  static void casting(Shape s) {
    Circle c = (Circle) s;
    }
  }



class Shape {}

class Rectangle extends Shape {}

class Circle extends Shape {}
