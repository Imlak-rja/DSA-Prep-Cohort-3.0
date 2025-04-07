// This is a simple program that checks if a number is divisible by both 2 and 3
// It uses an if-else statement to determine the result and prints "divisible" or "not divisible" accordingly.
// The program takes an integer input from the user
// The program is designed to be run in a console or terminal environment where the user can input their number
// The program uses the Scanner class to read input from the user
// The program checks if the input number is divisible by both 2 and 3
// If the number is divisible by both 2 and 3, it prints "divisible"
// If the number is not divisible by both 2 and 3, it prints "not divisible"
// The program is a simple demonstration of using if-else statements in Java
// This program checks if a number is divisible by both 2 and 3
// It uses an if-else statement to determine the result and prints "divisible" or "not divisible" accordingly.
// The program takes an integer input from the user
// The program is designed to be run in a console or terminal environment where the user can input their number
// The program uses the Scanner class to read input from the user
// The program checks if the input number is divisible by both 2 and 3
// If the number is divisible by both 2 and 3, it prints "divisible"
// If the number is not divisible by both 2 and 3, it prints "not divisible"
// The program is a simple demonstration of using if-else statements in Java
import java.util.Scanner;

public class FoundIfElseDivisibleByTwoAndThree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%2==0 && n%3==0){
            System.out.print("divisible");
        }else{
            System.out.print("not divisible");
        }
    }
}
