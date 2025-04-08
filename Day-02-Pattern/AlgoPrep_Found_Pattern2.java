// Problem: Found Pattern 2
// Link: https://www.algoprep.com/learn/algorithms/found-pattern-2/
// Description: Given an integer n, print a pattern of numbers in the following format:
// 1. The first line contains 1 number.
// 2. The second line contains 2 numbers.
// 3. The third line contains 3 numbers.
// 4. The fourth line contains 4 numbers.
// 5. The fifth line contains 5 numbers.
// 6. The sixth line contains 6 numbers.
// 7. The seventh line contains 7 numbers.
// 8. The eighth line contains 8 numbers
import java.util.*;

public class AlgoPrep_Found_Pattern2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int val = 1;
        int nst = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nst; j++) {
                System.out.print(val + " ");
                val++;
            }
            System.out.println();
            nst++;
        }
    }
}
