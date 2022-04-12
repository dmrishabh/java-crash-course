import java.util.Scanner;

public class que1_string {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String sentence, word = "", shortestWord = "";

        char ch;

        int i;

        System.out.println("Enter sentence");
        sentence = scanner.nextLine();
        sentence = sentence + " ";
        int minimumLength = sentence.length();

        for (i = 0; i < sentence.length(); i++) {

            ch = sentence.charAt(i);
            if (ch != ' ') {
                word = word + ch;
                // i can here you can you ? hello ... hello hello okay then re join or do
                // something with your internet

                // this is a cat
            } else {

                if (word.length() < minimumLength) {
                    minimumLength = word.length();
                    shortestWord = word;
                }
                word = "";
            }

        }
        System.out.println("Shortest word: " + shortestWord);
    }

}
