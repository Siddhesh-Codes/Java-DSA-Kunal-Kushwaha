import java.util.Scanner;

public class AvgMarks {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter Number of Subjects: ");
    int subjects = sc.nextInt();

    int marks;
    int totalMarks = 0;
    for(int i = 1; i <= subjects; i++){
      System.out.println("Enter the Marks for " +i+" subject :");
      marks = sc.nextInt();
      totalMarks += marks;
    }    
    double avg =(double) totalMarks / subjects;
    System.out.println("Average Marks: " +avg);
  }
}
