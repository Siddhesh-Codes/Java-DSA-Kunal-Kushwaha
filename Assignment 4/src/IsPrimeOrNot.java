import java.util.Scanner;

public class IsPrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(isPrime(n));
    }

    static boolean isPrime(int n){
        if (n <= 1) {
            return false;
        }
        int num = 2;

        while (num * num <= n){
            if (n % num == 0){
                return false;
            }
            num++;
        }
        return num*num > n;
    }
}
