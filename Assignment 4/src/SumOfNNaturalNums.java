import java.util.Scanner;

public class SumOfNNaturalNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num =  sc.nextInt();

        sumOfNNaturalNums(num);
    }

    static void sumOfNNaturalNums(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++){
            sum = (n * (n + 1)) / 2;
        }
        System.out.println(sum);
    }
}
