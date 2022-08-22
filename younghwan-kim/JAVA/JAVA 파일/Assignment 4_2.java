import java.util.Scanner;

public class assignment4_2 {
    public static void main(String[] args) throws Exception{
     /*m은 전공, c는 교양, n은 일반 교양*/
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int c = sc.nextInt();
        int n = sc.nextInt();
        sc.close();
        boolean pass_1 = (m>70) && (n >= 30 && c >= 30);
        boolean pass_2 = (m>70) && (c+n >= 80);
        System.out.println("전공 이수학점 : "+m);
        System.out.println("교양 이수학점 : "+c);
        System.out.println("일반 교양 이수학점 :"+n);
        if (pass_1 | pass_2){
            System.out.println("졸업가능 여부: 합격" );
        }
        else{
            System.out.println("졸업가능 여부: 불합격");
        }

        


    }
}
