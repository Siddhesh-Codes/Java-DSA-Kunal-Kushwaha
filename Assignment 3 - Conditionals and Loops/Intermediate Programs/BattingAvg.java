import java.util.Scanner;

public class BattingAvg {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the Total Runs Scored: ");
    int runs = sc.nextInt();

    System.out.print("Number of time Batsman got Dismissed: ");
    int dismissed = sc.nextInt();

    double avg = (double) runs / dismissed;

    System.out.println("Batting Avg: " +avg);
  }
}
