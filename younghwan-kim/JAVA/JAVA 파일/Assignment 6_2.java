public class Assignment6_2 {
    public static void main(String[] args) throws Exception{
    System.out.println(factorial(6));
    System.out.println(factorial(3,6));
    
    }   
    public static int factorial(int n, int m) {
        int ans = 1;
        for (int i = n; i<=m; i++){
            ans *= i;
        }
        return ans;
        }        
    public static int factorial(int n) {
        if (n==1){
            return 1;
            }
        else if (n==0){
            return 1;
        }
        else
            return factorial(n-1)*n;
        }  
}
