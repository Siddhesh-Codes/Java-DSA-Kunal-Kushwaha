import java.util.Scanner;

public class FibonacciUsingMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        Factorial(num);

    }

    static void Factorial(int n) {
        int product = 1;
        System.out.print(n+"! = ");
        for (int i = 1; i <= n; i++){
            System.out.print(i);
            if (i != n) System.out.print(" * ");
            product = product * i; // 1*1 = 1, 2*1 = 2, 3*2 = 6, 4*6 = 24
        }
        System.out.print(" = "+ product);

    }
}
