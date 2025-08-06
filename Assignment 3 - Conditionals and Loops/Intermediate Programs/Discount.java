import java.util.Scanner;

public class Discount {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double listingPrice = sc.nextInt();
    double sellingPrice = sc.nextInt();

    double discount = (double) listingPrice - sellingPrice;
    System.out.println("Total Discount: "+discount);


    double discountInPercent = ((listingPrice - sellingPrice) / listingPrice) * 100;
    System.out.println("Discount in Percentage: "+(int)discountInPercent+ "%");


  }  
}
