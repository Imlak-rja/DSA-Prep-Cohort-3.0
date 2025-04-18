import java.util.Scanner;

public class AlgoPrep_Found_SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long sum = N * (N + 1) / 2;
        System.out.println(sum);
    }
}