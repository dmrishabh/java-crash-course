import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        long product = 1;
        Scanner scanner = new Scanner(System.in);
        int myArray[] = new int[25];
        for (int i = 0; i < 25; i++) {
            System.out.println("enter a number");
            myArray[i] = scanner.nextInt();
        }
        for (int i = 1; i < 25; i = i + 2) {
            product = product * myArray[i];
        }
        System.out.println(product);
    }
}
