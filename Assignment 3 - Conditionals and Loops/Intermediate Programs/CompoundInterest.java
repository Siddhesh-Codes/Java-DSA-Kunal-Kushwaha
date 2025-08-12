import java.util.Scanner;

public class CompoundInterest {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);

  System.out.println("Enter the Principal Amount: ");
  int principalAmount = sc.nextInt();

  System.out.println("Enter the Rate of Interest: ");
  double rate = sc.nextDouble();
  rate = rate / 100;

  System.out.println("number of times interest is compounded per year: ");
  double n = sc.nextDouble();

  System.out.println("time the money is invested or borrowed: ");
  double t = sc.nextDouble();

  double A = (double) principalAmount * Math.pow(1 + rate/n, n*t);

  System.out.println("Compound Interest: " +A);
 } 
}
