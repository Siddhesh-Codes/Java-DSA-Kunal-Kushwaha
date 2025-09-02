import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Lines: ");
        int n = sc.nextInt();

        Pattern(n);
    }
    static void Pattern(int n) {
        for (int row = 0; row < n; row++) {
            int totalCols = n - row; // 4 - 0 = 4
            int spaces = n - totalCols; // 4 - 4 = 0
            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }

            for (int cols = 0; cols < totalCols; cols++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*
Key Formula:
totalCols = n - row;

spaces = n - totalCols;

Output:
Enter the Number of Lines: 5
*****
 ****
  ***
   **
    *

 */
