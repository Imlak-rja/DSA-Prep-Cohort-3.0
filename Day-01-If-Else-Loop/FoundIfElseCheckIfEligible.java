// This is a simple Java program that checks if a person is eligible to vote based on their age.
// It uses an if-else statement to determine eligibility and prints the result.
// The program takes an integer input representing the age of the person.
// The program is designed to be run in a console or terminal environment where the user can input their age.
// The program uses the Scanner class to read input from the user.
// The program checks if the input age is greater than or equal to 18.
// If the age is 18 or older, it prints "eligible".
// If the age is less than 18, it prints "not eligible".
// The program is a simple demonstration of using if-else statements in Java.

import java.util.*;

public class FoundIfElseCheckIfEligible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n >= 18) {
            System.out.println("eligible");
        } else {
            System.out.println("not eligible");
        }
    }
}
