import java.util.Scanner;

//  making a class
public class num_Div {
    // main/ driver code
    public static void main(String[] args) {
        // declaring variable
        int i, sum = 0, n;
        // Scanner class object
        Scanner scanner = new Scanner(System.in);
        // messages to user to enter length
        System.out.println("Enter size of  an array");
        // holding value in n
        n = scanner.nextInt();
        // making array object
        int arr[] = new int[n];
        // messages to user to enter elements

        System.out.println("enter " + n + "numbers");
        // traversing the array
        for (i = 0; i < arr.length; i++) {
            // storing value in array
            arr[i] = scanner.nextInt();
            // checking if element is divisible by 3 and 2
            if (arr[i] % 2 == 0 && arr[i] % 3 == 0) {
                sum = sum + arr[i]; // storing sum by adding all no.
            }
        }
        System.out.println("Sum of numbers div by 3 and 2 is " + sum); // printing output
    }
}
