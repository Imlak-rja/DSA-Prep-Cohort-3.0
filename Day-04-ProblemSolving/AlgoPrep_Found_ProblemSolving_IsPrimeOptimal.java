import java.io.*;
import java.util.*;

public class AlgoPrep_Found_ProblemSolving_IsPrimeOptimal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLong()) { 
            long N = scanner.nextLong();
            if (isPrime(N)) {
                System.out.println("Yay");
            } else {
                System.out.println("Nay");
            }
        } else {
            System.out.println("No input provided."); 
        }
        scanner.close(); 
    }

    public static boolean isPrime(long N) {
        if (N <= 1) {
            return false;
        }
        
        for (long i = 2; i * i <= N; i++) {
            if (N % i == 0) {
                return false; 
            }
        }
        
        return true; // Add this return statement!
    }
}