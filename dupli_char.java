import java.util.Scanner;

/**
 * sample input = i have an apple tree in my garden
 * output:
 * apple
 * tree
 */

public class dupli_char {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String sentence, word = "";

        char ch;
        int i, j;

        /////////////////////////////////////////////

        System.out.println("Enter any Sentence");
        sentence = sc.nextLine();
        sentence = sentence + " ";
        for (i = 0; i < sentence.length(); i++) {

            ch = sentence.charAt(i);
            if (ch != ' ') {
                word = word + ch;

            } else {

                int flag = 0;
                for (j = 0; j < word.length() - 1; j++) {

                    if (word.charAt(j) == word.charAt(j + 1)) {

                        flag = 1;
                        break;

                    }
                }
                if (flag == 1) {
                    System.out.println(word);

                }

                word = "";
            }

        }

    }

}
