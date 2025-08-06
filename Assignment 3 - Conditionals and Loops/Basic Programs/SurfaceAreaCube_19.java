import java.util.Scanner;

public class SurfaceAreaCube_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side of cube: ");
        double side = sc.nextDouble();
        double tsa = 6 * side * side;
        System.out.println("Total Surface Area of Cube = " + tsa);
    }
}
