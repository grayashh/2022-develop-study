
class Shape {
}

class Rectangle extends Shape {
}

class Circle extends Shape {
}

public class Assignment11_1 {
  public static void main(String[] args) {
    Rectangle r = new Rectangle();
    try {
      casting(r);
    } catch (ClassCastException e) {
      System.out.println("casting은 상위 클래스와 하위 클래스 간에 발생합니다.");
    }
  }

  static void casting(Shape s) {
    Circle c = (Circle) s;
  }
}
