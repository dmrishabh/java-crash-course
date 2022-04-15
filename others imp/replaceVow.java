import java.util.Scanner;

public class replaceVow {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string ");
        String str = scanner.nextLine();
        String strLower = str.toLowerCase();
        String newString = "";
        for (int i = 0; i < strLower.length(); i++) {
            char ch = strLower.charAt(i);
            switch (ch) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':

                    newString = newString + (char) (ch + 1);
                    break;
                default:
                    newString = newString + ch;
            }
        }
        System.out.println("New string is " + newString);

    }

}
