import java.util.Scanner;

public class SumOfTwoNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 =  sc.nextInt();
        int n2 =  sc.nextInt();
        System.out.println("Sum is: "+sum(n1,n2));
    }

    static int sum(int num1 , int num2) {
        return num1 + num2;
    }
}
