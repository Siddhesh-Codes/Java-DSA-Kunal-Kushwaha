
import java.util.Arrays;
import java.util.Scanner;

public class PassingInFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];

        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(num));
        printArray(num);
        System.out.print(Arrays.toString(num));

    }

    static void printArray(int[] arr) {
//        for (int num: arr){
//            System.out.print(num + " ");
//        }
        arr[0] = 99;
    }
}
