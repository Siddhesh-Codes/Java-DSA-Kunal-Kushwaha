import java.util.Scanner;

public class AreaOfIsoscelesTriangle {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int base = sc.nextInt();
    int height = sc.nextInt();

    double area = 0.5 * base * height;

    System.out.println("Area of Isosceles Triangle: " +area);
  }
}