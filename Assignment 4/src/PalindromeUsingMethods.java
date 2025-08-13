import java.util.Scanner;

public class PalindromeUsingMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        palindromeNum(num);
    }

    static void palindromeNum(int n){
        int og = n; // 121
        int revNum = 0;
        if (n < 0) System.out.println("Negative numbers are not palindromes");
        else {
            while (n > 0) {
                int rem = n % 10;
                revNum = (revNum * 10) + rem; // 0 * 10 + 1 = 0+1 = 1
                n /= 10;
            }
            if (og == revNum) System.out.println("Number is Palindrome!!");
            else System.out.println("Number is Not Palindrome!!");
        }
    }
}
