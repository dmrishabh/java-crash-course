import java.util.Scanner;

/**
 * que14_duplicateRemoval
 */
public class que14_duplicateRemoval {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String senString, dString = "";
        int i, j, k, len;

        char ch;

        System.out.println("enter a sentence");
        senString = scanner.nextLine();
        len = senString.length();

        char chArray[] = new char[len];

        for (i = 0; i < len; i++) {

            chArray[i] = senString.charAt(i);

        }

        for (i = 0; i < len - 1; i++) {
            for (j = i + 1; j < len; j++) {

                if (chArray[i] == chArray[j]) {
                    len = len - 1;
                    for (k = j; k < len; k++) {

                        chArray[k] = chArray[k + 1];

                    }

                }

            }

        }

        for (i = 0; i < len; i++) {

            dString = dString + chArray[i];

        }
        System.out.println("The modified sentence is :- " + dString);
    }

}