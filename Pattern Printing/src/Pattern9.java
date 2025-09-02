import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Lines: ");
        int n = sc.nextInt();

        printPattern(n);
    }

    static void printPattern(int n) {
        for (int row = 0; row < n; row++) {
            int spaces = row;
            int totalCols = 2 * (n - row) - 1;
            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }
            for (int st = 0; st < totalCols; st++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*
Key Formula:
totalCols = 2 * (n - row) - 1;

spaces = rows;

Output:
Enter the Number of Lines: 5
*********
 *******
  *****
   ***
    *

 */