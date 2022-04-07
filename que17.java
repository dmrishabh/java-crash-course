import java.util.Scanner;

/**
 * que17
 */
public class que17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence, word = "", temp;
        char ch;
        int i, j;
        System.out.println("Enter any Sentence");
        sentence = sc.nextLine();
        sentence = sentence + " ";
        for (i = 0; i < sentence.length(); i++) {

            ch = sentence.charAt(i);
            if (ch != ' ') {
                word = word + ch;

            } else {
                temp = word;

                word = word.toLowerCase();

                for (j = 0; j < word.length() - 1; j++) {

                    if (Math.abs(word.charAt(j) - word.charAt(j + 1)) == 1) {
                        System.out.println(temp);
                        break;

                    }

                }
                word = "";

            }
        }
    }
}