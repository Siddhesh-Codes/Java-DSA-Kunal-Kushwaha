import java.util.Scanner;

public class SubandMulti {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt(); // 234

    int result = 0;
    int multi = 1;
    int add = 0;
    while (n > 0) {
      int rem = n % 10;
      n = n / 10;

      multi *= rem;
      add += rem; 

      result = multi - add;
    }
    System.out.println(result);
  }
}
