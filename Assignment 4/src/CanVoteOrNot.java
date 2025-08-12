import java.util.Scanner;

public class CanVoteOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        voting(n);
    }

    static void voting(int n) {
        if (n >= 18) {
            System.out.println("Congratulations!!, You are Eligible for Voting.");
        } else {
            System.out.println("Sorry :( You are not Eligible for Voting.");
        }
    }
}
