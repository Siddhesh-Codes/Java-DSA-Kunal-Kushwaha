import java.util.Scanner;

public class SimpleFunctionUsingVoid {
  static void greet() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Your Name: ");
    String st = sc.nextLine();

    System.out.println("Hello, "+st+"!");
  }  

  public static void main(String[] args) {
    greet();
  }
}
