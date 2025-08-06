import java.util.Scanner;

public class AreaOfRectangle_03 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int l = sc.nextInt();
    int w = sc.nextInt();

    double area = l * w;
    System.out.println("Area of Rectangle: "+area);

  }
}
