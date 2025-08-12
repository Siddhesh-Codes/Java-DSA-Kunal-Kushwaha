import java.util.Scanner;

public class ProductOfTwoNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        if (n2 == 0) {
            System.out.println("Can not Divide By 0!");
        } else {
            System.out.println("The Product is: " +product(n1,n2));
        }
    }

    static int product(int num1, int num2) {
            return num1 * num1;
    }
}
