import java.util.Scanner;

public class SimpleFunctionReturn {
  static int sum(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter First Number: ");
    int num1 = sc.nextInt();

    System.out.print("Enter Second Number: ");
    int num2 = sc.nextInt();

    return num1+num2;
  }

  public static void main(String[] args) {
    int sum = sum();

    System.out.println("Addition is: "+ sum);
  }
}


