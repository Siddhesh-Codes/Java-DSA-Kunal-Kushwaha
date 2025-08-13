import java.util.Scanner;

public class PrimeNumsInGivenRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        printPrimesInRange(n1, n2);
    }

    static void printPrimesInRange(int n1, int n2) {
        if (n1 < 1 || n2 < 1 || n1 > n2) {
            System.out.println("Enter Valid Number!!");
            return;
        }
        for (int i = n1; i <= n2; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}