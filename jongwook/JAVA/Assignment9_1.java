
public class Assignment9_1 {
  public static void main(String[] args) {
    Triangle t1 = new Triangle(10.0, 5.0);
    Triangle t2 = new Triangle(5.0, 10.0);
    Triangle t3 = new Triangle(6.0, 8.0);

    System.out.println(t1.findArea());
    System.out.println(t1.isSameArea(t2));
    System.out.println(t1.isSameArea(t3));
  }

  static class Triangle {
    double width;
    double height;

    public Triangle(double width, double height) {
      this.width = width;
      this.height = height;
    }

    public double findArea() {
      return width * height * 0.5;
    }

    public boolean isSameArea(Triangle T) {
      if (T.findArea() == findArea()) {
        return true;
      } else {
        return false;
      }
    }
  }
}
