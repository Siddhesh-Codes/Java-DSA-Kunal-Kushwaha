import java.util.Scanner;

public class SwapNumbers {
  static void swap(int a, int b){
    int temp = a;
    a = b;
    b = temp;
    System.out.println("After swap: a = " + a + ", b = " + b);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter 1st Number: ");
    int a = sc.nextInt();

    System.out.print("Enter 2nd Number: ");
    int b = sc.nextInt();
    
    System.out.println("Before swap: a = " + a + ", b = " + b);
    swap(a,b);
  }
}