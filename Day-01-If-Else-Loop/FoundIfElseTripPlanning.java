// This is a simple Java program that takes an integer input
// representing the amount of money a person has.
// It uses an if-else statement to determine where the person can go on a trip.
// If the amount is greater than or equal to 10000, it suggests going to Goa.
// If the amount is less than 10000, it suggests going to Murthal.
// The program is designed to be run in a console or terminal environment where the user can input their amount.
// The program uses the Scanner class to read input from the user.
// The program checks if the input amount is greater than or equal to 10000.
// If the amount is 10000 or more, it prints "goa".
// If the amount is less than 10000, it prints "murthal".
import java.util.Scanner;

public class FoundIfElseTripPlanning {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if (n >= 10000) {
            System.out.println("goa");
        } else {
            System.out.println("murthal");
        }
    }
}
