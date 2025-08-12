import java.util.Scanner;

public class LargestAndSmallestNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        maximum(num1,num2,num3);
        minimum(num1,num2,num3);
    }

    static void maximum (int a, int b, int c){
        if (a > b && a > c) {
            System.out.println(a+ " is maximum");
        } else if (b > a && b > c){
            System.out.println(b + " is maximum");
        } else {
            System.out.println(c + " is maximum");
        }
    }

    static void minimum (int a, int b, int c) {
        if (a < b && a < c){
            System.out.println(a +" is minimum");
        } else if (b < a && b < c){
            System.out.println(b + " is minimum");
        } else {
            System.out.println(c + "is minimum");
        }
    }
}
