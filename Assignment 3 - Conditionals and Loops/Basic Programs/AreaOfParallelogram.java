import java.util.Scanner;

public class AreaOfParallelogram {
  public static void main(String[] args) {
    Scanner sc =  new Scanner(System.in);

    System.out.print("Enter the Base and Height: ");
    int base = sc.nextInt();
    int height =  sc.nextInt();

    double area = base * height;

    System.out.println("Area of Parallelogram: "+area);
  }
}
