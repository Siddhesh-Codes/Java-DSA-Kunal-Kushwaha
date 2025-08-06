import java.util.Scanner;

public class DistanceTwoPoints {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the first line co-ordinates: ");
    int x1 = sc.nextInt();
    int y1 = sc.nextInt();

    System.out.println("Enter the second line co-ordinates: ");
    int x2 = sc.nextInt();
    int y2 = sc.nextInt();

    double distance = Math.sqrt((x2-x1)*(x2-x1) + ((y2-y1) * (y2-y1)));
    System.out.printf("The Distance is: %.2f", distance);

  }  
}
