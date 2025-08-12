import java.util.Scanner;

public class ArmStrongNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        System.out.println(isArmstrong(num));
    }

    static boolean isArmstrong (int n) {
        int og = n;
        int sum = 0;
        while (n > 0){
            int rem = n % 10;
            n /= 10;
            sum += rem * rem * rem;
        }

        return sum == og;

    }
}
