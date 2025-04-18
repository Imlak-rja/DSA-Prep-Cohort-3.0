import java.util.Scanner;

public class AlgoPrep_Found_Arrays1_SwapIndexes2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        // Swap the elements at a and b
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
        
        // Print the array
        for (int i = 0; i < n; i++) {
            System.out.print(array[i]);
            if (i < n - 1) {
                System.out.print(" ");
            }
        }
    }
}

