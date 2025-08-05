import java.util.Scanner;

public class PerimeterOfCircle_08 {
  public static void main(String[] args) {
    final float pi = 3.14f;
    Scanner sc = new Scanner(System.in);

    int radius = sc.nextInt();

    double area = 2 * pi * radius;
    System.out.println("Perimeter Of Circle:" +area);
  }  
}
