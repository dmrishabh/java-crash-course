import java.util.Scanner;

public class que8Array {

    public static void main(String[] args) {

        int n, sum, i, j;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size of the array");

        n = scanner.nextInt();

        int arr[] = new int[n];

        System.out.println("enter " + n + "elements");

        for (i = 0; i < n; i++) {

            arr[i] = scanner.nextInt();

            sum = 0;
            for (j = 1; j < arr[i]; j++) {
                if (arr[i] % j == 0 && j % 2 == 0) {

                    sum = sum + j;

                }

            }
            System.out.println("even factor sum of " + arr[i] + " = " + sum);

        }
    }

}
