// This program checks if a student has passed or failed based on their score.
// It uses an if-else statement to determine the result and prints "pass" or "fail" accordingly.
// The program takes an integer input representing the score of the student.
// The program is designed to be run in a console or terminal environment where the user can input their score.
// The program uses the Scanner class to read input from the user.
// The program checks if the input score is greater than or equal to 35.
// If the score is 35 or more, it prints "pass".
// If the score is less than 35, it prints "fail".
// // The program is a simple demonstration of using if-else statements in Java.
import java.util.Scanner;

public class FoundIfElsePassOrFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n >= 35) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }
    }
}
