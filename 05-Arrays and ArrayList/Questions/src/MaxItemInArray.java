import java.util.Scanner;

public class MaxItemInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of the Array: ");
        int size =  sc.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter the Array Elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        maxNum(arr);
    }

    static void maxNum(int[] arr) {
        int max = arr[0];
        int maxIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }
        System.out.println("Max Item in the Array is: " + max + " at index: " + maxIndex);


//        Using Enhanced For Loop
//        for (int i : arr){
//            if (i > maxIndex){
//                maxIndex = i;
//            }
//        }
//        System.out.println(maxIndex);

    }
}
