import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Lines: ");
        int n = sc.nextInt();

        Pattern(n);
    }

    static void Pattern(int n){
        for (int row = 1; row <=n ; row++) {
            // for every row, run the cols
            for (int col = 1; col <=row ; col++) {
                System.out.print(col+" ");
            }
            // when one row is printed we need to add a new line
            System.out.println();
        }
    }
}

/*
Output:

Enter the Number of Lines: 5
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5

 */
