// This is a simple program that checks if a number is odd or even
// It uses an if-else statement to determine the result and prints "even" or "odd" accordingly.
// The program takes an integer input from the user
// The program is designed to be run in a console or terminal environment where the user can input their number
// The program uses the Scanner class to read input from the user
// The program checks if the input number is divisible by 2
// If the number is divisible by 2, it prints "even"
// If the number is not divisible by 2, it prints "odd"
// The program is a simple demonstration of using if-else statements in Java
import java.util.Scanner;

public class FoundIfElseOddOrEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
