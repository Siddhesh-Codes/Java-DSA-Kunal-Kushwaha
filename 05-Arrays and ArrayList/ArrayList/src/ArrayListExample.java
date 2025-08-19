import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        list.add(56);
        list.add(3);
        list.add(6);
        list.add(5);
        list.add(26);
        list.add(36);
        list.add(569);


//        for (int i = 0; i < 5; i++) {
//            list.add(sc.nextInt());
//        }
        System.out.println(list);

    }
}
