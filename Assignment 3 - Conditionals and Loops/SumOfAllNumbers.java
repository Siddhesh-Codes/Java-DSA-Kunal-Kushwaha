import java.util.Scanner;

public class SumOfAllNumbers {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int large = 0;

    while (true) {
    System.out.print("Enter Number: ");
    int num = sc.nextInt();
      if (num == 0) {
        break;
      } else {
        if (num > large) {
          large = num;
        }
        System.out.println("Largest Number is: "+large);
      }
    }
  }
}
