import java.util.Scanner;

public class Power {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter the base: ");
    double base = sc.nextDouble();

    System.out.print("Enter the exponent: ");
    double exponent = sc.nextDouble();

    double power = Math.pow(base, exponent);
    System.out.printf("Power of %.1f raised to %.1f is: %.1f", base, exponent, power);

  }  
}
