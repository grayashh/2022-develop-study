import java.util.Scanner;
public class assignment5 {
    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(System.in);
        System.out.print("신장을 입력하시오: ");
        float T = in.nextFloat();
        System.out.print("체중을 입력하시오: ");
        float W = in.nextFloat();
        in.close();   
        String tall = String.format("%.2f", T/100);
        float TALL =Float.parseFloat(tall);
        double BMI = W/(TALL * TALL); 
        System.out.printf("BMI: %.2f \n", BMI);
        if(BMI >=30)
            System.out.println("비만도: 비만");
        else{
            if (25 <= BMI)
            System.out.println("비만도: 과체중");

            else{
                if (18.5<=BMI)
                System.out.println("비만도: 정상");

                else{
                    System.out.println("비만도: 저체중");
                }
            }
        }
    }
} 
