import java.util.Scanner;

public class AverageOfNNumbers {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("How many numbers you want to enter: ");
    int n = sc.nextInt();
    System.out.println("Enter the "+n+" numbers");
    int num = 0;
    int sum = 0;
    for(int i = 0; i < n; i++){
      num = sc.nextInt();
      sum += num;
    }
    double average = (double) sum / n;
    System.out.println("Average: " + average);
  }  
}
