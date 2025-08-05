import java.util.*;
public class Q6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the Currency in Rupees: ");
    float rupees = sc.nextFloat();

    float usd = rupees / 87.25f;
    System.out.println("Currency in USD:"+usd );
  }
}
