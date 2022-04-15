import java.util.*;

public class cs {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length");
        int n = sc.nextInt();
        char ar[] = new char[n];
        for (int i = 0; i < n; i++) {
            System.out.println("enter a character");
            ar[i] = sc.next().charAt(0);
        }
        int countCase = 0;
        for (int i = 0; i < n; i++) {
            if (Character.isUpperCase(ar[i])) {
                countCase++;
            }
        }
        System.out.println("total number of upercase \t" + countCase);
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (Character.isLowerCase(ar[i])) {
                count++;
            }
        }
        System.out.println("total number of lowercase \t" + count);
        int counting = 0;
        for (int i = 0; i < n; i++) {
            if (ar[i] == 'A' ||
                    ar[i] == 'a' ||
                    ar[i] == 'E' ||
                    ar[i] == 'e' ||
                    ar[i] == 'I' ||
                    ar[i] == 'i' ||
                    ar[i] == 'O' ||
                    ar[i] == 'o' ||
                    ar[i] == 'U' ||
                    ar[i] == 'u') {
                counting++;
            }
        }
        System.out.println("total number of vowels \t" + counting);
    }
}