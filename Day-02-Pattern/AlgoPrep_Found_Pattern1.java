// Date: 2023-10-02
// Author: Shubham Kumar
// Problem: Found Pattern 1
// Link: https://www.algoprep.com/learn/algorithms/found-pattern-1/
// Description: Given an integer n, print a pattern of stars in the following format:
// 1. The first line contains 1 star.
// 2. The second line contains 2 stars.
import java.util.*;

public class AlgoPrep_Found_Pattern1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print("* ");
            }
            System.out.println();
            m++;
        }
    }
}

