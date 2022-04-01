import java.util.Scanner;

public class digit_Sum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int ar[] = new int[10], i, sum, digit, temp;

        System.out.println("Enter 10 integer");
        for (i = 0; i < 10; i++) {

            ar[i] = sc.nextInt();

            sum = 0;
            temp = ar[i];

            while (temp != 0) {

                sum = sum + temp % 10;
                temp = temp / 10;
                // sum += temp % 10;
                // temp /= 10;
            }
            System.out.println("Digits sum of " + ar[i] + " = " + sum);

        }

    }

}
