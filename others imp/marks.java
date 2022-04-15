import java.util.Scanner;

public class marks {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int total = 0;

        System.out.println("Enter the number of student");
        int n = sc.nextInt();

        int sub1[] = new int[n];
        int sub2[] = new int[n];

        for (int i = 0; i < n; i++) {

            System.out.println("enter marks in subject one of ");
            sub1[i] = sc.nextInt();
            System.out.println("enter marks in subject two ");
            sub2[i] = sc.nextInt();

        }
        for (int j = 0; j < n; j++) {

            total = sub1[j] + sub2[j];
            System.out.println(total);

        }

    }

}
