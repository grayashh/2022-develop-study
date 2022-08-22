import java.util.Scanner;

public class assignment4 {
    public static void main(String[] args) throws Exception{
        int ans = 0;
        System.out.println("0~999 사이의 숫자를 입력하십시오: ");
        Scanner s = new Scanner(System.in);
        String n = s.nextLine();
        s.close();
        for (int i =0; i<n.length(); i++ ){
            ans += Integer.parseInt(n.substring(i,i+1));
        }
        System.out.println("각 자릿수의 합은 "+ ans+ "입니다.");    


    }
}
