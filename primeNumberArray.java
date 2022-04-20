import java.util.Scanner;

public class primeNumberArray {

    public static void main(String[] args) {
        int count;
        Scanner scanner = new Scanner(System.in);
        int arr[] = new int[10];

        System.out.println("Enter 10 numbers");

        for (int i = 0; i < 10; i++) {

            arr[i] = scanner.nextInt();

            if (isPrime(arr[i])) {

                System.out.println(arr[i] + " this is prime");

            }
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
