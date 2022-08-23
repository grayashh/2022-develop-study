public class Assignment10_1 {
  public static void main(String[] args) {
    Square s = new Square();
    s.name = "정사각형";
    s.length = 3;
    Triangle t = new Triangle();
    t.name = "삼각형";
    t.base = 4;
    t.height = 3;
    Circle c = new Circle();
    c.name = "원";
    c.radius = 4;
    Shape[] shapes = { s, t, c };
    for (int i = 0; i < shapes.length; i++) {
      System.out.printf("%s의 넓이: %.2f\n", shapes[i].name, shapes[i].area());
    }
  }
}

class Shape {
  String name;

  double area() {
    return 0;
  }
}

class Square extends Shape {
  int length;

  double area() {
    return length * length;
  }
}

class Triangle extends Shape {
  int base;
  int height;

  double area() {
    return base * height / 2;
  }
}

class Circle extends Shape {
  int radius;

  double area() {
    return radius * radius * 3.141592;
  }
}