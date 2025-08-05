import java.util.Scanner;

public class Q3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter Principle Amount:");
    int P = sc.nextInt();

    System.out.println("Enter Rate of Interest");
    float R =  sc.nextFloat();

    System.out.println("Enter Time Duration:");
    int T = sc.nextInt();


    int SI = (int)(P * R * T) / 100 ;
      System.out.println("Simple Interest : " + SI);
  }
}
