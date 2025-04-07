// This program checks if a number is prime or not using a loop.
// It takes an integer input from the user and counts the number of divisors.
// If the number of divisors is exactly 2, it is prime; otherwise, it is not.
// The program is designed to be run in a console or terminal environment where the user can input their number.
// The program uses the Scanner class to read input from the user.
// The program checks if the input number is prime by counting its divisors.
// If the number of divisors is exactly 2, it prints "Prime".
// If the number of divisors is not exactly 2, it prints "Not Prime".
// The program is a simple demonstration of using loops in Java.
import java.util.Scanner;

public class FoundLoopsIsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            System.out.print("Prime");
        } else {
            System.out.print("Not Prime");
        }
    }
}
