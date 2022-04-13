import java.util.Scanner;

public class que4_noVowel {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String sentence, word = "";
        int i, j, count;
        char ch;

        System.out.println("Enter any sentence");
        sentence = sc.nextLine();
        sentence = sentence + " ";
        for (i = 0; i < sentence.length(); i++) {

            ch = sentence.charAt(i);
            if (ch != ' ') {

                word = word + ch;

            }

            else {
                count = 0;
                for (j = 0; j < word.length(); j++) {

                    ch = word.charAt(j);
                    ch = Character.toLowerCase(ch);
                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                        count++;
                    }
                }
                if (count == 0) {

                    System.out.println(word);
                }
                word = "";
            }
        }
    }
}
