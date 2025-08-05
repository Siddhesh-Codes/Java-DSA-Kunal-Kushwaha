import java.util.Scanner;

public class CSAOfCylinder_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();
        System.out.print("Enter height: ");
        double height = sc.nextDouble();
        double csa = 2 * Math.PI * radius * height;
        System.out.println("Curved Surface Area of Cylinder = " + csa);
    }
}
