import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Marks: ");
        int marks = sc.nextInt();

        if (marks <= 0) System.out.println("Please Enter Valid Marks!!");
        else
            gradingSystem(marks);
    }

    static void gradingSystem(int marks) {
        if (marks <= 40) System.out.println("Fail");
        else if (marks <= 50) System.out.println("DD");
        else if (marks <= 60) System.out.println("CD");
        else if (marks <= 70) System.out.println("BC");
        else if (marks <= 80) System.out.println("BB");
        else if (marks <= 90) System.out.println("AB");
        else if (marks <= 100) System.out.println("AA");
    }
}
