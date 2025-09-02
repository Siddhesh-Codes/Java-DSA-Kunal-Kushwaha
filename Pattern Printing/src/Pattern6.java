import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Pattern(n);
    }
    static void Pattern(int n) {
        for (int row = 1; row <= n; row++) {
            int spaces = n - row; // 4 - 4 = 0
            for (int s = 1; s <= spaces; s++) {
                System.out.print(" ");
            }

            for (int cols = 1; cols <= row; cols++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
