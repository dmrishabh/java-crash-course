import java.util.Scanner;
// supriya wala 

public class maxVowel {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s, w = "", temp, maxVow = "";

        int i, j, max = 0;
        char ch;

        System.out.println("Enter any sentence");

        s = sc.nextLine();

        s = s + " ";

        for (i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (ch != ' ') {

                w = w + ch;

            } else {
                temp = w;
                w = w.toLowerCase();
                int count = 0;

                for (j = 0; j < w.length() - 1; j++) {

                    ch = w.charAt(j);
                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {

                        count++;

                    }
                }

                if (count > max) {

                    max = count;
                    maxVow = temp;
                }

                w = "";

            }

        }

        System.out.println("Word with maximum vowel is " + maxVow);

    }

}
