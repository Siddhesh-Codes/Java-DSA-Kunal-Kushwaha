import java.util.Scanner;

public class ArmStrongNumbers {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        System.out.println(isArmstrong(num));

        for (int i = 100; i < 1000; i++) {
            if (isArmstrong(i)){
                System.out.print(i +" ");
            }
        }
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
