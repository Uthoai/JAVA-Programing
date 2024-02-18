import java.util.Scanner;

public class BinarySearch {
    // take variable 'n' is size of an array which carry data and store as ascending order.
    // take variable 'x' is for searching value 

    public static void binarySearch(int arr[],int x){
        int low = 0, high = arr.length-1, mid = (low+high)/2;
        while (low<=high) {
            if (arr[mid] == x) {
                System.out.println("Found Searching value "+ x +" and Location is "+mid);
                break;
            }
            else if (arr[mid]<x) {
                low = mid + 1;
            }
            else{
                high = mid -1;
            }
            mid = (low+high)/2;
        }

        if(low>high){
            System.out.println("Item not found....");
        }

    }

    public static void main(String[] args){
        @SuppressWarnings("resource")
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter Array Size: ");
        int n = userInput.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter Array Element:");
        for (int i = 0; i < n; i++) {
            arr[i] = userInput.nextInt();
        }

        System.out.print("Enter Searching Element: ");
        int x = userInput.nextInt();
        binarySearch(arr,x);
    }
}