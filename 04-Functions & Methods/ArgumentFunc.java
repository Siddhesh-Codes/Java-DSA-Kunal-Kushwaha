import java.util.Scanner;

public class ArgumentFunc {
  static String greet(String name) {
    String message = "Hello "+name;
    return message;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter your name: ");
    String name = sc.next();

    String Message = greet(name);
    System.out.print(Message);
  }
}
