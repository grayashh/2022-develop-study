class Triangle {
    private double base;
    private double height;
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    public double getBase() {
        return base;
    }
    public double getHeight() {
        return height;
    }
    public double findArea() {
        return (base * height) / 2;
    }
    public boolean isSameArea(Triangle triangle) {
        if (triangle.findArea() == findArea()) {
            return true;
        }
        else {
            return false;
        }
    }
}

public class Assignment9_1 {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(10.0, 5.0);
        Triangle t2 = new Triangle(5.0, 10.0);
        Triangle t3 = new Triangle(6.0, 8.0);
              
        System.out.println(t1.findArea());
        System.out.println(t1.isSameArea(t2));
        System.out.println(t1.isSameArea(t3));
    }
}
