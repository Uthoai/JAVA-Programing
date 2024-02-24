public class RecursionBasic {

    //print number n to 1 with recursion...
    public static void printNum(int n){
        if (n==0) {                 //base case
            return;
        }
        //System.out.print(n+" ");    //5 to 1
        printNum(n-1);              //resursion
        System.out.print(n+" ");    //1 to 5
    }
 

    //Print sum of first n natural numbers...
    public static void printSumOfNum(int i,int n,int sum){
        if (i==n) {
            sum+= i;
            System.out.println("\n"+sum);
            return;
        }
        sum += i;
        printSumOfNum(i+1, n, sum);
    }

    // print x^n (stack height = n)
    public static int calPower(int x,int n){       //x is value, n is power.
        if (x == 0) {
            return 0; 
        }
        if (n == 0) {
            return 1;
        }
        int xPowerNum = calPower(x, n-1);
        int xPower = x * xPowerNum;
        return xPower;
    }


    public static void main(String[] args){
        int n = 5;
        printNum(n);    //call printNum() function, output: 5 4 3 2 1

        printSumOfNum(1, 50, 0);     //call printSumOfNum() function, output: 15

        System.out.println(calPower(2, 5));
    }
}
