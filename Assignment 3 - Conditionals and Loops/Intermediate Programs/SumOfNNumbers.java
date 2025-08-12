import java.util.Scanner;

public class SumOfNNumbers {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the Number till you want the Sum: ");
    int n = sc.nextInt();

    int sum = n * (n + 1)/2;
    System.out.println("Sum Of N Numbers: " +sum);
  }
}
