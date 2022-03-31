import java.util.Scanner;

public class freq_Num {

    public static void main(String[] args) {

        int i, countOfPositive = 0, countOfNegative = 0, countOfZero = 0, n; // variables

        Scanner scanner = new Scanner(System.in);

        System.out.println("ENter size of array ");

        n = scanner.nextInt();

        int num[] = new int[n];

        System.out.println("Enter " + n + " numbers ");

        for (i = 0; i < n; i++) {

            num[i] = scanner.nextInt();

            if (num[i] > 0)
                countOfPositive++;

            else if (num[i] < 0)
                countOfNegative++;

            else
                countOfZero++;

        }
        System.out.println("Fq of +ve " + countOfPositive);
        System.out.println("Fq of -ve " + countOfNegative);
        System.out.println("Fq of 0s " + countOfZero);
    }

}
