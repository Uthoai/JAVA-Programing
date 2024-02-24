import java.util.Scanner;

public class RecursionFibonacci{

    public static void fibonacci(int a,int b,int n){        //a is first digit 0, b is seccond digit 1;
        if (n == 0) {
            return;
        }
        int c = a + b;
        System.out.print(c +" ");
        fibonacci(b,c,n-1);
    }

    public static void main(String[] args){
        @SuppressWarnings("resource")
        Scanner userInput = new Scanner(System.in);
        int a = 0;
        int b = 1;
        System.out.print("Enter digit to get fibonacci series: ");
        int n = userInput.nextInt();

        if (n <= 1) {
            if (n < 0) {
                System.out.println("ERROR Input...");
                return;
            }
            if (n == 0) {
                System.out.println("0");
                return;
            }
            System.out.println("0 1");
            return;
        }
        else {
            System.out.print("0 1 ");
            fibonacci(a,b,n-2);
        }
    }
}