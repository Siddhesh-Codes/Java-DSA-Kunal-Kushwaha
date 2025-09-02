import java.util.Scanner;

public class Pattern28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Lines: ");
        int n = sc.nextInt();

        Pattern(n);
    }

    static void Pattern(int n) {
        for (int row = 0; row < 2 * n ; row++) {
            int totalColsInRow = row > n ? 2 * n - row : row;

            int spaces = n - totalColsInRow;
            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }

            for (int col = 0; col < totalColsInRow ; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}

/*
Key Formula:
totalCols = row > n ? 2 * n - row : row;

spaces = n - totalCols;

Output:
Enter the Number of Lines: 5

    *
   * *
  * * *
 * * * *
* * * * *
 * * * *
  * * *
   * *
    *

 */
