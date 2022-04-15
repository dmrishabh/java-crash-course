import java.util.Arrays;
import java.util.Scanner;

public class binarysrch {

    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        int array[] = { 12, 14, 15, 1, 10, 9 };// new int[5];

        // for (int i = 0; i < array.length; i++) {
        // System.out.println("enter no");
        // array[i] = scanner.nextInt();

        // }

        Arrays.sort(array);

        // for (int i = 0; i < array.length; i++) {
        // System.out.print(array[i] + "\t");
        // }

        int key = 10;

        int last = array.length - 1;

        int first = 0;

        int mid = (first + last) / 2;

        while (first <= last) {

            if (array[mid] < key) {

                first = mid + 1;

            } else if (array[mid] == key) {

                System.out.println("Element is found at index :- " + mid);
                break;

            } else {

                last = mid - 1;

            }
            mid = (first + last) / 2;
        }

        if (first > last) {

            System.out.println("Element is not found in the array");

        }

    }

}
