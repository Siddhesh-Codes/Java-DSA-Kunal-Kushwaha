import java.util.Scanner;

public class Commission {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double commissionAmt = sc.nextInt();
    double totalRevenue = sc.nextInt();

    double commissionRate =  (commissionAmt / totalRevenue) * 100;
    System.out.println("Commission Rate: "+commissionRate+"%");
  }  
}
