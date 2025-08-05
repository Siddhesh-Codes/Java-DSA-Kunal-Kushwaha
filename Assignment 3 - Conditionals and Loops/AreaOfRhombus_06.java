import java.util.Scanner;

public class AreaOfRhombus_06 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int d1 = sc.nextInt();
    int d2 = sc.nextInt();

    double area = 0.5 * d1 * d2;
    System.out.println("Area of Rhombus: "+area);
  }  
}
