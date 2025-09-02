import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Lines: ");
        int n = sc.nextInt();

        Pattern(n);
    }

    static void Pattern(int n){
        for (int row = 1; row <=n ; row++) {
            // for every row, run the cols
            for (int col = 1; col <= n-row+1 ; col++) {
                System.out.print("* ");
            }
            // when one row is printed we need to add a new line
            System.out.println();
        }
    }
}

/*

Key formula: n - row + 1

Output:

Enter the Number of Lines: 5
* * * * *
* * * *
* * *
* *
*

 */
