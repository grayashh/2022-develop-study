import javafx.scene.shape.Shape;

public class AreaCalculator {
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
        Shape[] shapes = {s, t, c};
        for (int i = 0; i < shapes.length; i++) {
            System.out.printf("%s의 넓이 : %.2f\n", shapes[i].name, shapes[i].area());
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
    public String name;
    int length; // 정사각형의 한 변의 길이
    double area() {
        return Math.pow(length, 2);
    }
}
class Triangle extends Shape {
    public String name;
    int base;    // 삼각형 밑변의 길이
    int height;  // 삼각형의 높이
    double area() {
        return (base * height) % 2;
    }
}
class Circle extends Shape {
    public String name;
    int radius;    // 원의 반지름
    double area() {
        return (Math.pow(radius, 2)) * Math.PI;
    }
}