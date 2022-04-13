import java.util.Scanner;

public class que7_Reverse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String sentence, word = "", reversString = "";
        char ch;
        int i;

        System.out.println("enter sentence");
        sentence = sc.nextLine();
        sentence = sentence + " ";

        for (i = 0; i < sentence.length(); i++) {

            ch = sentence.charAt(i);
            if (ch != ' ') {
                word = word + ch;

            } else {
                reversString = word + " " + reversString;
                word = "";
            }

        }
        System.out.println(reversString);
    }

}
