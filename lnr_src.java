import java.util.Scanner;

public class lnr_src {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Enter length of an array");
        n = sc.nextInt();
        int arr[] = new int[n], i, val, flag = 0, index = 0;

        System.out.println("Enter " + n + "  integers");

        for (i = 0; i < n; i++) {

            arr[i] = sc.nextInt();

        }
        System.out.println("Enter a number to be searched ");
        val = sc.nextInt();
        for (i = 0; i < arr.length; i++) {

            if (arr[i] == val) {
                flag = 1;
                index = i;
                break;
            }
        }
        if (flag == 1) {
            System.out.println("successful at " + index);

        } else {
            System.out.println("Unsuccessful");
        }

    }
}
