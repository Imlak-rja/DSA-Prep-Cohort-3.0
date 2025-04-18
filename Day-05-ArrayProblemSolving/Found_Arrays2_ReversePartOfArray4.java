import java.util.Scanner;

public class Found_Arrays2_ReversePartOfArray4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int s = sc.nextInt();
        int e = sc.nextInt();
        
        // Reverse the subarray from index s to e
        while (s < e) {
            int temp = array[s];
            array[s] = array[e];
            array[e] = temp;
            s++;
            e--;
        }
        
        // Print the array
        for (int i = 0; i < n; i++) {
            System.out.print(array[i]);
            if (i < n - 1) {
                System.out.print(" ");
            }
        }
    }
}