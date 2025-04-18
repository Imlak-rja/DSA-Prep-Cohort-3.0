import java.util.Scanner;

public class AlgoPrep_Found_FloorSQRTN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        System.out.println(floorSqrt(N));
    }

    public static long floorSqrt(long x) {
        if (x == 0 || x == 1)
            return x;
        long low = 1, high = x, ans = 0;
        while (low <= high) {
            long mid = (low + high) / 2;
            if (mid * mid == x)
                return mid;
            if (mid * mid < x) {
                low = mid + 1;
                ans = mid;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
}