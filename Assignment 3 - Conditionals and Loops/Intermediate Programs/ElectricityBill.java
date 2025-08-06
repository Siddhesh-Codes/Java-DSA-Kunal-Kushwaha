import java.util.Scanner;

public class ElectricityBill {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter Previous Month Readings: ");
    int previousReading = sc.nextInt();

    System.out.print("Enter Current Month Readings: ");
    int currentReading = sc.nextInt();

    int perUnitRate = 7;
    System.out.println("Per Unit Rate: "+perUnitRate);

    int fixedCharges = 50;
    System.out.println("Fixed Charges: "+fixedCharges);

    int units = currentReading - previousReading;
    System.out.println("Total Units Used in Current Month: "+ units);

    int bill = (units * perUnitRate) + fixedCharges; // 200 * 7 = 1400 + 50 = 1450.

    double billGST = bill + (bill * 0.18); // 1450 * 0.18
    System.out.println("Total Bill: "+billGST);
  }  
}
