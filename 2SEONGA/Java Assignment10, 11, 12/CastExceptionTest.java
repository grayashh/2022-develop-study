class Shape {}

class Rectangle extends Shape {}

class Circle extends Shape {}

public class CastExceptionTest {
  public static void main(String[] args) {
    Rectangle r = new Rectangle();
    try {
    casting(r);
    } catch (ClassCastException exception) {
      System.out.println("코드가 하위 유형이 아닌 유형에 대한 참조를 캐스팅하려고 시도하였습니다.");
    }
  }  

  static void casting(Shape s) {
    Circle c = (Circle) s;
  }
}
