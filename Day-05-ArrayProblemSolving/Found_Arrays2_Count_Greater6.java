import java.util.Scanner;

public class Found_Arrays2_Count_Greater6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        
        int max = array[0];
        for (int i = 1; i < n; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] != max) {
                count++;
            }
        }
        
        System.out.println(count);
    }
}