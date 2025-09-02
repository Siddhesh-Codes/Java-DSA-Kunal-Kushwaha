import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Pattern(n);
    }

    static void Pattern(int n){
        for (int row = 0; row <=n * 2; row++) {
            // for every row, run the cols
            int totalColsInRows = row > n ? 2 * n - row : row;
            for (int col = 0; col <=totalColsInRows ; col++) {
                System.out.print("* ");
            }
            // when one row is printed we need to add a new line
            System.out.println();
        }
    }
}
