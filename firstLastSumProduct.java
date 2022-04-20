import java.util.Scanner;

public class firstLastSumProduct {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int firstDigit = 0, lastDigit = 0, n, i, temp, product, sum;

        System.out.println("enter size of array");
        n = scanner.nextInt();
        int arr[] = new int[n];
        System.out.println("enter " + n + "elements");
        for (i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            sum = 0;
            temp = arr[i];
            lastDigit = temp % 10;
            while (temp != 0) {

                firstDigit = temp % 10;
                temp = temp / 10;

            }

            sum = firstDigit + lastDigit;
            product = firstDigit * lastDigit;
            System.out.println("sum of of f and l digi = " + sum);
            System.out.println("PROD of of f and l digi = " + product);
        }
    }

}
