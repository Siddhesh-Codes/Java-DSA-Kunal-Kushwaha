import java.util.Scanner;

public class CGPA {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the sum of SGPA: ");
    double sgpa = sc.nextDouble();

    System.out.println("Enter the Number of Semesters: ");
    int sems = sc.nextInt();
    
    double cgpa = (double) (sgpa / sems);

    System.out.println("CGPA: "+cgpa);
  }
}
