import java.util.Scanner;

public class VolumeCone_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();
        System.out.print("Enter height: ");
        double height = sc.nextDouble();
        double volume = (Math.PI * radius * radius * height) / 3;
        System.out.println("Volume of Cone = " + volume);
    }
}
