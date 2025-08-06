import java.util.Scanner;

public class AreaOfCircle_01 {
  public static void main(String[] args) {
    float pi = 3.14f;

    Scanner sc = new Scanner(System.in);

    int radius = sc.nextInt();

    double area =  pi * radius*radius;
    System.out.println("Area of Circle: "+area);
  }  
}
