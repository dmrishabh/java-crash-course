
import java.util.Scanner;

/**
 */
public class strQue3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s, w = "", vowWord = "";
        int i, j, count, max = 0;
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
                if (count > max) {

                    max = count;
                    vowWord = w;

                }

                w = "";
            }
        }
        System.out.println("word with maximum vowels is  :- " + vowWord);
    }
}