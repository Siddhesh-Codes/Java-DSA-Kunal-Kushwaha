import java.util.Scanner;

public class AreaOfTriangle_02 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int base = sc.nextInt();
    int height = sc.nextInt();

    double area = 0.5 * ( base * height);

    System.out.println("Area of Triangle: " + area);
  }
}