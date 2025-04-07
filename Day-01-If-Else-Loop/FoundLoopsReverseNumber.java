// FoundLoopsReverseNumber.java
// This program reverses a number using a while loop
// It takes an integer input from the user  and prints the reversed number
// The program is designed to be run in a console or terminal environment where the user can input their number
// The program uses the Scanner class to read input from the user
// The program checks if the input number is negative
// If the number is negative, it converts it to positive
// The program uses a while loop to extract the last digit of the number
// and prints it
// The last digit is obtained using the modulus operator (%)
// The number is then divided by 10 to remove the last digit
// The loop continues until the number becomes 0
// The program prints the reversed number
// The program is a simple demonstration of using loops in Java
import java.util.Scanner;

public class FoundLoopsReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n < 0) {
            n = -n; // ya n = n * -1;
        }

        while (n > 0) {
            int lastDigit = n % 10;
            System.out.print(lastDigit);
            n = n / 10;
        }
    }
}
