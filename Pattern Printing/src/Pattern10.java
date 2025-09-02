import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Lines: ");
        int n = sc.nextInt();

        Pattern(n);
    }

    static void Pattern(int n) {
        for (int row = 0; row < n; row++) {
            int totalCols = row + 1;
            int spaces = n - totalCols;
            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }

            for (int cols = 0; cols < totalCols; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

/*
Key Formula:
totalCols = row + 1;

Output:
Enter the Number of Lines: 5
    *
   * *
  * * *
 * * * *
* * * * *

 */