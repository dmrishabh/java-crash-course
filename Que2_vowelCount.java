import java.util.Scanner;

/**
 * Que3_vowelCount
 */
public class Que2_vowelCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s, w = "";
        int i, j, count;
        char ch;

        System.out.println("Enter any sentence");
        s = sc.nextLine();
        s = s + " ";

        for (i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (ch != ' ') {
                w = w + ch;
            } else {

                count = 0;
                for (j = 0; j < w.length(); j++) {
                    ch = w.charAt(j);

                    ch = Character.toLowerCase(ch);
                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {

                        count++;

                    }

                }

                System.out.println("frequency of vowels in " + w + " = " + count);
                w = "";
            }
        }
    }
}