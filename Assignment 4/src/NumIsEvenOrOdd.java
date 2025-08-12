import java.util.Scanner;

public class NumIsEvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        evenOfOdd(num);

    }

    static void evenOfOdd(int n) {
        if (n % 2 == 0) {
            System.out.println("Even Number!");
        } else {
            System.out.println("Odd Number!");
        }
    }
}
