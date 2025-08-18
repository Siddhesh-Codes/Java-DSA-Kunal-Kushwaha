import java.util.Arrays;
import java.util.Scanner;

public class IntoToArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initialization and Declaration of the Arrays
//        int[] arr = new int[5];
//
//        for (int i = 0; i < arr.length; i++){
//            arr[i] = sc.nextInt();
//        }

        // Enhanced for loop to iterate fast in the array
//        for (int num: arr){
//            System.out.print(num + " ");
//        }

//        System.out.println(Arrays.toString(arr));



//        Arrays String Examples

        String[] str = new String[5];

        for (int i = 0; i < str.length; i++){
            str[i] = sc.next();
        }
//
//        for (String s : str){
//            System.out.print(s + " ");
//        }
        System.out.println(Arrays.toString(str));
    }
}
