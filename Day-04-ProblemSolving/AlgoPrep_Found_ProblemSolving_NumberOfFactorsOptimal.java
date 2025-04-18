// Problem: https://www.hackerrank.com/challenges/factors/problemjava
// Created by: AlgoPrep
// Date: 2023-10-04
// Time Complexity: O(sqrt(N))
// Space Complexity: O(1)
// This code counts the number of factors of a given integer N.
// It uses an optimal approach by iterating only up to the square root of N.
// For each divisor found, it counts both the divisor and its complement.
// If the divisor is the square root of N, it counts it only once.
// The final count is printed as the output.
// Note: The code is written in Java and uses Scanner for input.

// Importing necessary libraries

import java.io.*;
import java.util.*;

public class AlgoPrep_Found_ProblemSolving_NumberOfFactorsOptimal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int count = countFactors(N);
        System.out.println(count);
    }

    public static int countFactors(int N) {
        int count = 0;
        for (int i = 1; i * i <= N; i++) {
            if (N % i == 0) {
                if (i * i == N) {
                    count++;
                } else {
                    count += 2;
                }
            }
        }
        return count;
    }
}