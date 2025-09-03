import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.print("Enter the Element of the Array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element which you have to search in the array: ");
        int target = sc.nextInt();

//        System.out.println(linearSearch(arr, target));
//        System.out.println(linearSearch2(arr, target));
        System.out.println(linearSearch3(arr, target));

    }
    // return the index
    static int linearSearch (int[] arr, int target){
        if (arr.length == 0) {
            return -1;
        }
        // search in the array if the element is found return the index of the element
        // if the element not found then return -1

        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];

            if (element == target) {
                return index;
            }
        }
        // if the element not found in the array
        return -1;
    }

    // return the element
    static int linearSearch2 (int[] arr, int target){
        if (arr.length == 0) {
            return -1;
        }
        // search in the array if the element is found return the index of the element
        // if the element not found then return -1

        for (int element : arr){
            if (element == target){
                return element;
            }
        }
        // if the element not found in the array
        return -1;
    }

    //return true or false
    static boolean linearSearch3 (int[] arr, int target){
        if (arr.length == 0) {
            return false;
        }
        // search in the array if the element is found return the index of the element
        // if the element not found then return -1

        for (int element : arr){
            if (element == target){
                return true;
            }
        }
        // if the element not found in the array
        return false;
    }
}
