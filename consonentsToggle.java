// import java.util.Scanner;

// /**
// * consonentsToggle
// */
// public class consonentsToggle {

// public static void main(String[] args) {

// Scanner sc = new Scanner(System.in);

// String sentence, word = "", newWord = " ", toggledString = "";

// int i, j;
// char ch;

// System.out.println("enter sentence");
// sentence = sc.nextLine();

// sentence = sentence + " ";

// for (i = 0; i < sentence.length(); i++) {
// ch = sentence.charAt(i);
// if (ch != ' ') {

// word = word + ch;

// } else {

// for (j = 0; j < word.length(); j++) {

// ch = word.charAt(j);

// ch = Character.toLowerCase(ch);

// if (ch == 'a' ||
// ch == 'e' ||
// ch == 'i' ||
// ch == 'o' ||
// ch == 'u'

// ) {

// toggledString = toggledString + word;

// } else {
// ch = Character.toUpperCase(ch);
// newWord = newWord + ch;
// toggledString = toggledString + newWord;
// }

// }

// word = " ";
// }

// }
// System.out.println("out put is : " + toggledString);

// }
// }