// Problem Link: https://www.algoexpert.io/questions/Found%20Pattern%204
// Problem: Found Pattern 4
// Description: Given an integer n, print a pattern of stars in the following format:
// 1. The first line contains n/2 + 1 stars.
// 2. The second line contains n/2 stars.
// 3. The third line contains n/2 - 1 stars.
// 4. The fourth line contains n/2 - 2 stars.
// 5. The fifth line contains n/2 - 3 stars.
// 6. The sixth line contains n/2 - 4 stars.
// 7. The seventh line contains n/2 - 5 stars.
// 8. The eighth line contains n/2 - 6 stars.
// 9. The ninth line contains n/2 - 7 stars.
// 10. The tenth line contains n/2 - 8 stars.
// 11. The eleventh line contains n/2 - 9 stars.
// 12. The twelfth line contains n/2 - 10 stars.
import java.util.*;

public class AlgoPrep_Found_Pattern4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nsp = 1;
        int nst = n / 2 + 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nst; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <= nsp; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= nst; j++) {
                System.out.print("*");
            }

            if (i <= n / 2) {
                nst = nst - 1;
                nsp = nsp + 2;
            } else {
                nst = nst + 1;
                nsp = nsp - 2;
            }
            System.out.println();
        }
    }
}
