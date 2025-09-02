import java.util.Arrays;
import java.util.Scanner;

public class SwapTheElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));


        System.out.print("Enter the indices to swap: ");
        int index1 = sc.nextInt();
        int index2 = sc.nextInt();
        swap(arr, index1, index2);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int i1, int i2) {
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }
}
