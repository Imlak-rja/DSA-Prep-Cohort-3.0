//  Author: Shubham Kumar
//  Date: 2023-10-01
//  Description: This program finds the maximum of three integers using if-else statements.
//  It takes three integer inputs from the user and prints the maximum value among them.
//  The program is designed to be run in a console or terminal environment where the user can input their integers.
//  The program uses the Scanner class to read input from the user.
//  The program checks the values of the three integers using if-else statements.
//  If the first integer is greater than or equal to both the second and third integers, it prints the first integer.
//  If the second integer is greater than or equal to both the first and third integers, it prints the second integer.
//  If neither of the above conditions is true, it prints the third integer.
//  The program is a simple demonstration of using if-else statements in Java to find the maximum of three integers.
import java.util.Scanner;

public class FoundIfElseMaxOfThreeIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a >= b && a >= c) {
            System.out.println(a);
        } else if (b >= a && b >= c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }
}
