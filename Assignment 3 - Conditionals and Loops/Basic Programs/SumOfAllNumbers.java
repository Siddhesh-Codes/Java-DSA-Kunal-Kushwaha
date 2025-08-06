import java.util.Scanner;

public class SumOfAllNumbers {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int ans = 0;

    while (true) {
    System.out.print("Enter Number: ");
    int num = sc.nextInt();
      if (num == 0) {
        break;
      } else {
        ans += num;
        System.out.println("Addition is: "+ans);
      }
    }
  }
}
