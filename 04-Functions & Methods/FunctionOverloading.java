public class FunctionOverloading {
    public static void main(String[] args) {
        fun(56);
//        fun("Siddhesh");
        fun("Siddhesh",20);
    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println(name);
    }

    static void fun(String name, int age){
        System.out.println("Name: "+name+" age: "+age);
    }
}
