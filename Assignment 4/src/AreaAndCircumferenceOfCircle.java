import java.util.Scanner;

public class AreaAndCircumferenceOfCircle {
    static final double pi = 3.14;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double r = sc.nextInt();
        System.out.printf("Area is: %.2f", Area(r,pi));
        System.out.println();
        System.out.printf("Circumference is: %.2f", Circumference(r,pi));
    }

    static double Area(double r, double pi){
        double area = pi * r * r;
        return area;
    }

    static double Circumference(double r, double pi){
        double circumference = 2 * pi * r;
        return circumference;
    }
}
