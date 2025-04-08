// Pattern 3
// Problem: Found Pattern 3
// Link: https://www.algoprep.com/learn/algorithms/found-pattern-3/
// Description: Given an integer n, print a pattern of stars in the following format:
// 1. The first line contains n stars.
// 2. The second line contains n-1 stars.
// 3. The third line contains n-2 stars.
// 4. The fourth line contains n-3 stars.
// 5. The fifth line contains n-4 stars.
// 6. The sixth line contains n-5 stars.
import java.io.*;
import java.util.*;

public class AlgoPrep_Found_Pattern3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int nst = 1;
        int nsp = n / 2;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= nst; k++) {
                System.out.print("*");
            }
            if (i <= n / 2) {
                nst = nst + 2;
                nsp = nsp - 1;
            } else {
                nst = nst - 2;
                nsp = nsp + 1;
            }
            System.out.println();
        }
    }
}
