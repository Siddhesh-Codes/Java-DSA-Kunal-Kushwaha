import java.util.*;

public class ArmstrongNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the Number: ");
    int num = sc.nextInt();

    int originalNum = num;
    int count = 0;

    // Step 1: Count the number of digits
    int temp = num;
    while (temp > 0) {
      temp = temp / 10;
      count++;
    }

    // Step 2: Calculate sum of digits raised to power of count
    int sum = 0;
    temp = num;
    while (temp > 0) {
      int rem = temp % 10;
      sum += Math.pow(rem, count);
      temp = temp / 10;
    }

    // Step 3: Check if it's an Armstrong number
    if (sum == originalNum) {
      System.out.println(true);
    } else {
      System.out.println(false);
    }

    sc.close();
  }
}
