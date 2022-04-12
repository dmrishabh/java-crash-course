import java.util.Scanner;

public class QuestionMobName {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the array");

        int n = sc.nextInt();

        String names[] = new String[n];
        long mobNo[] = new long[n];

        for (int i = 0; i < n; i++) {

            System.out.println("Enter Name ");
            names[i] = sc.nextLine();

        }

        for (int i = 0; i < n; i++) {

            System.out.println("Enter his phone no");
            mobNo[i] = sc.nextLong();

        }

        // getting key

        System.out.println("enter mobile no");
        long key = sc.nextLong();

        for (int index = 0; index < n; index++) {

            if (key == mobNo[index]) {

                System.out.println("This phone belongs to " + names[index]);

            } else {
                System.out.println("NO SUCH ELEMENT FOUND");

            }
        }

    }
}
