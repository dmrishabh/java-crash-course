import java.util.Scanner;

public class pigLantin {

    public static boolean isVowel(char c) {

        // if ( c == 'A' ||
        // c == 'E' ||
        // c == 'I' ||
        // c == 'O' ||
        // c == 'U' ||
        // c == 'a' ||
        // c == 'e' ||
        // c == 'i' ||
        // c == 'o' ||
        // c == 'u'

        // ) {
        // return true;

        // }
        // return false;
        return (c == 'A' ||
                c == 'E' ||
                c == 'I' ||
                c == 'O' ||
                c == 'U' ||
                c == 'a' ||
                c == 'e' ||
                c == 'i' ||
                c == 'o' ||
                c == 'u');

    }

    static String pigString(String s) {

        int len = s.length();

        int index = -1;

        for (int i = 0; i < len; i++) {

            if (isVowel(s.charAt(i))) {

                index = i;
                break;

            }

        }
        // if there is no vowel in the word then
        if (index == -1) {

            return "-1";
        }

        String pString = s.substring(index) + s.substring(0, index) + "ay";
        return pString;

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        String str = pigString(s);

        if (str == "-1") {
            System.out.println("NO vowel found so pig latin not possible");

        } else
            System.out.println(str);
    }

}
/*
 * ! paris = arispay || amazon = amazonay
 * 
 * the first vowel occurring in the input word is places at the start of new
 * word
 * along with the remaining alphabets
 * end of new word is followed by "AY"
 * 
 */