import java.util.*;

public class AlgoPrep_Found_FibonacciNumber_HW {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibonacci(n));
    }

    static int fibonacci(int n) {
        if (n == 0) return 0;
        int[][] result = {{1, 0}, {0, 1}}; // Identity matrix
        int[][] base = {{1, 1}, {1, 0}};
        n = n - 1;

        while (n > 0) {
            if ((n & 1) == 1) {
                result = multiply(result, base);
            }
            base = multiply(base, base);
            n >>= 1;
        }

        return result[0][0]; // This holds F(n)
    }

    static int[][] multiply(int[][] A, int[][] B) {
        int[][] C = new int[2][2];
        C[0][0] = A[0][0] * B[0][0] + A[0][1] * B[1][0];
        C[0][1] = A[0][0] * B[0][1] + A[0][1] * B[1][1];
        C[1][0] = A[1][0] * B[0][0] + A[1][1] * B[1][0];
        C[1][1] = A[1][0] * B[0][1] + A[1][1] * B[1][1];
        return C;
    }
}
