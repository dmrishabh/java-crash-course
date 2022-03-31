import java.util.Scanner;

/**
 * merge_array
 */
public class merge_array {

    public static void main(String[] args) {

        // declare

        int P[] = new int[6], Q[] = new int[4], R[] = new int[10], i;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter element in an array P");
        for (i = 0; i < 6; i++) {
            P[i] = sc.nextInt();
        }
        System.out.println("Enter element in an array Q");
        for (i = 0; i < 4; i++) {
            Q[i] = sc.nextInt();
        }

        for (i = 0; i < 10; i++) {

            if (i < 6) {

                R[i] = P[i];

            } else {
                R[i] = Q[i - 6];

            }

        }

        System.out.println("Merged Array");
        for (i = 0; i < R.length; i++) {

            System.out.print(R[i] + "\t");

        }
    }
}