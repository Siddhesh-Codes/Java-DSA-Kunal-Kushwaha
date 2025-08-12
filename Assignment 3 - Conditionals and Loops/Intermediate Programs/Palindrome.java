import java.util.Scanner;

public class Palindrome {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    
    int ogNum = n;
    int revNum = 0;
    while(n > 0){
      int lastDig = n % 10;
      revNum = revNum * 10 + lastDig;
      n /= 10;
    }

    if (ogNum == revNum) {
      System.out.println(true);
    } else {
      System.out.println(false);
    }
  }
}
