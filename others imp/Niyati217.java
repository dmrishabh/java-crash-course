
// importing scanner class from util package
import java.util.Scanner;

// making a class named Niyati217
public class Niyati217 {

    // driver function
    public static void main(String[] args) {

        int myArray[] = new int[20]; // making an array of size 20
        int evenArray[] = new int[10]; // making an array of same size to dtor even number
        int n = 0; // n to store index of evenArray
        Scanner scanner = new Scanner(System.in); // scanner class object
        for (int i = 0; i < 20; i++) {
            System.out.println(" enter a number");
            myArray[i] = scanner.nextInt();
            if (myArray[i] % 2 == 0) {
                evenArray[n] = myArray[i];
                n++;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(evenArray[i] + "\t");

        }

    }
}
