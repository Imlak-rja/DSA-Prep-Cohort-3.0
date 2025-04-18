import java.util.*;

public class AlgoPrep_Found_Functions1_Fact_ncr_npr {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input values
        int n = sc.nextInt();
        int r = sc.nextInt();

        // Calculate factorials
        int nfact = fact(n);
        int rfact = fact(r);
        int nrfact = fact(n - r);

        // Calculate nPr and nCr
        int npr = nfact / nrfact;          // nPr = n! / (n-r)!
        int ncr = npr / rfact;            // nCr = nPr / r!

        // Output results
        System.out.println(nfact);        // n!
        System.out.println(npr);          // nPr
        System.out.println(ncr);          // nCr
    }

    // Factorial function
    public static int fact(int n) {
        int ans = 1;
        for (int i = 1; i <= n; i++) {
            ans = ans * i;
        }
        return ans;
    }
}