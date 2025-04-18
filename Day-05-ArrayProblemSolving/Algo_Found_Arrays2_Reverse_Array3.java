import java.util.Scanner;

public class Algo_Found_Arrays2_Reverse_Array3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read array size
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        // Read array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Reverse the array
        int SP = 0;
        int EP = arr.length - 1;
        
        while (SP < EP) {
            // Swap elements
            int temp = arr[SP];
            arr[SP] = arr[EP];
            arr[EP] = temp;
            
            // Move pointers
            SP++;
            EP--;
        }
        
        // Print reversed array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}