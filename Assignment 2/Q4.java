import java.util.Scanner;

public class Q4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter First Number:");
    int num1  = sc.nextInt();

    System.out.print("Enter Second Nunber:");
    int num2 = sc.nextInt();

    System.out.println("Enter the Operator (eg. +,-,*,/:)");
    String op = sc.next();

    int result;
    if (op.equals("+")) {
      result = num1 + num2;
      System.out.println("Addition is: "+ result);
    } else if (op.equals("-")) {
      result = num1 - num2;
      System.out.println("Subtraction is: "+result);
    } else if(op.equals('*')){
      result = num1 * num2;
      System.out.println("Multiplication is: "+result);
    } else {
      float result1 = num1 / num2;
      System.out.println("Division is: "+result1);
    }
  }
}
