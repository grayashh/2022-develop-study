public class FindFactorial {
    public static void main(String[] args) throws Exception {
        int num1 = 10, num2 = 4, num3 = 10;

        System.out.printf("factorial(%d) = %d\n", num1, factorial(num1));
        System.out.printf("factorial(%d, %d) = %d", num2, num3, factorial(num2, num3));
    }
    public static int factorial(int n) {
        int a = 1;
        int b = 1;
        while (a <= n) {
            b *= a;
            a++;
        }
        return b; 
    }
    public static int factorial(int n1, int n2) {
        int a = n1;
        int b = n2;
        while (a <= n2) {
            b *= a;
            a++;
        }
        return b;
    }
}
