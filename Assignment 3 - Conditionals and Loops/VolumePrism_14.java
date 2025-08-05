import java.util.Scanner;

public class VolumePrism_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base area: ");
        double baseArea = sc.nextDouble();
        System.out.print("Enter height: ");
        double height = sc.nextDouble();
        double volume = baseArea * height;
        System.out.println("Volume of Prism = " + volume);
    }
}
