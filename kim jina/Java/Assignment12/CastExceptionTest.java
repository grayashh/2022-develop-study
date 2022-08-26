class Shape {}

class Rectangle extends Shape {}

class Circle extends Shape {}

public class CastExceptionTest {
  public static void main(String[] args) {
  Rectangle r = new Rectangle();
  casting(r);
}

  static void casting(Shape s) {
    try {
      Circle c = (Circle) s;
    } catch (ClassCastException e) {
        System.out.println("에러: 캐스팅 오류가 발생했습니다.");
    }
  }
}
