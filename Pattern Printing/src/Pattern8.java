import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Lines: ");
        int n = sc.nextInt();

        Pattern(n);
    }

    static void Pattern(int n){
        for (int row = 0; row < n; row++) {
            int spaces = n - row - 1;
            int totalCols = 2 * row + 1;

            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col < totalCols; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*
Key Formula:
totalCols = 2 * row + 1;
spaces = n - row - 1;

Output:
Enter the Number of Lines: 5
    *
   ***
  *****
 *******
*********

 */
