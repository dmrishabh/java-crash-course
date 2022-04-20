import java.util.Scanner;

public class max_min {

    public static void main(String[] args) {
        // declaring variables
        int num[] = new int[10];
        int i, j, max, min, pOmin = 0, pOmax = 0;
        // making Scanner class object .............
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any 10 numbers"); // showing msg to user

        for (i = 0; i < 10; i++) {
            num[i] = scanner.nextInt();
        }
        max = num[0];
        min = num[0];

        for (j = 1; j < 10; j++) {
            if (num[j] > max) {
                max = num[j];
                pOmax = j

            } else if (num[j] < min) {

                min = num[j];

                pOmin = j;

            }
        }

        System.out.println("Maximum Number : " + max + " Position: " + pOmax);
        System.out.println("Minimum Number : " + min + " Position: " + pOmin);

    }

}
