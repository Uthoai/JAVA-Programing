public class RecursionFactorial {

    public static int calFactorial(int n) {
        if (n==1 || n==0) {
            return 1;
        }
        int factNm1 = calFactorial(n-1);
        int fact_n = n * factNm1;
        return fact_n;
    }


    public static void main(String[] args) {
        int n = 10;
        int factorial = calFactorial(n);
        System.out.println(factorial);
    }
}