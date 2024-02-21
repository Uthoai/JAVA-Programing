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

    public static void main(String[] args){
        int n = 5;
        printNum(n);    //call printNum() function, output: 5 4 3 2 1
        printSumOfNum(1, 5, 0);     //call printSumOfNum() output: 15
    }
}
