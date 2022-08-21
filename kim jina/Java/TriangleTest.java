public class TriangleTest {

    public static void main(String[] args) throws Exception {
        Triangle t1 = new Triangle(10.0, 5.0);
        Triangle t2 = new Triangle(5.0, 10.0);
        Triangle t3 = new Triangle(6.0, 8.0);

        System.out.println(t1.findArea());
        System.out.println(t1.isSameArea(t2));
        System.out.println(t1.isSameArea(t3));
    }
    
}
class Triangle {
    private double width;
    private double height;
    private double area;

    public Triangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // public double getWidth() {
    //     return width;
    // }
    // public double getHeight() {
    //     return height;
    // }
    // public double getArea() {
    //     return area;
    // }
    

    public double findArea() {
        area = width * height / 2;
        return area;
    }
    public boolean isSameArea(Triangle T) {
        if (findArea()==T.findArea()) {
            return true;
        }
        else {
            return false;
        }
    }
}