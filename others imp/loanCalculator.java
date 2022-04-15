import java.util.Scanner;

/**
 * loanCalculator
 */
public class loanCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int am = sc.nextInt();
        for (int month = 0; month < 3; month++) {
            int inst = (am * 10) / 100;
            am = am - inst;
        }

        System.out.println(am);
    }
}