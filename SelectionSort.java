import java.util.Scanner;

public class SelectionSort {

    public static void selectionSort(int arr[]){
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArray(int arr[]) {
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int n = userInput.nextInt();                // take 'n' variable to set array size.
        int[] arr = new int[n];                     // take 'arr' variable to declear an array.

        System.out.println("Enter Array Element: ");
        for(int i = 0; i < n ; i++){
            arr[i] = userInput.nextInt();
        }
        
        selectionSort(arr);
        printArray(arr);
    }
}