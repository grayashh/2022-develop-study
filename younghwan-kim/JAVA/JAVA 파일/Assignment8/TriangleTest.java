class Triangle{
    double side;
    double height;
    public Triangle(double side, double height){
        this.side = side;
        this.height = height;
    }
    public double getSide(){
        return side;
    }
    public double getHeight(){
        return height;
    }
    public double findArea(){
        return side * height * 1d/2;
        
    }
    public boolean isSameArea(Triangle t){
        if(t.findArea() == findArea() ){
            return true;
        } else{
            return false;
        }
    }
}
public class TriangleTest {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(10.0, 5.0);
        Triangle t2 = new Triangle(5.0, 10.0);
        Triangle t3 = new Triangle(6.0, 8.0);
        
        System.out.println(t1.findArea());
        System.out.println(t1.isSameArea(t2));
        System.out.println(t1.isSameArea(t3));
     }
  
}
