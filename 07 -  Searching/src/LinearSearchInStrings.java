import java.util.Scanner;

public class LinearSearchInStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your String: ");
        String str = sc.nextLine();

        System.out.println("Enter the target which u want to find: ");

        char target = sc.next().charAt(0);
        System.out.print(search2(str, target));
    }
    static boolean search(String str, char target){
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target){
                return true;
            }

        }
        return false;
    }

    //Using for-each loop
    static boolean search2(String str, char target){
        for (char ch : str.toCharArray())
            if (target == ch){
                return true;
        }
        return false;
    }
}
