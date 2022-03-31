import java.util.Scanner;

public class fact_array {

    public static void main(String[] args) {

        int i, j, n;
        long fact;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length");

        n = sc.nextInt();

        int num[] = new int[n];

        System.out.println("Enter " + n + " numbers");

        for (i = 0; i < n; i++) {
            num[i] = sc.nextInt();

            fact = 1;

            for (j = 1; j <= num[i]; j++) {

                fact *= j;

            }
            System.out.println("Factorial of " + num[i] + " = " + fact);
        }

    }

}
