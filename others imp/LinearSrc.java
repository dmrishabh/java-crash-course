import java.util.Scanner;

public class LinearSrc {

    // public static int LinearS(int arr[], int key) {

    // for (int i = 0; i < arr.length; i++) {

    // if (arr[i] == key) {

    // return i;

    // }

    // }
    // return -1;

    // }

    public static void main(String[] args) {

        System.out.println("Enter length of an array ");

        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();

        int arr[] = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.println("Enter element");
            arr[i] = scanner.nextInt();
        }
        // for (int i = 0; i < length; i++) {

        // System.out.print(arr[i] + "\t");
        // }

        System.out.println("Enter element to be searched");

        int key = scanner.nextInt();

        // l S
        // ! System.out.println(LinearS(arr, key));

        // if (LinearS(arr, key) == -1) {

        // System.out.println("Element not found");

        // } else {

        // System.out.println("Element found at " + LinearS(arr, key));

        // }

        for (int i = 0; i < length; i++) {

            if (arr[i] == key) {

                System.out.println("Element found at " + i);

            } else {
                System.out.println("Element not found");

            }

        }
    }
}