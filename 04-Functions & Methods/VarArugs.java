import java.util.Arrays;

public class VarArugs {
    public static void main(String[] args) {
        func(2,3,5,36,3,5,2,6,4,1,5);
    }
    static void func(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
