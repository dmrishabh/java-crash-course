/**
 * question
 */
public class question {

    public static void main(String[] args) {

        char c = 'A';

        System.out.println("------------output------------");

        for (int i = 1; i <= 26; i++) {

            // int ascii = (int) c;

            System.out.print(c + " = " + (int) c + " , ");
            c += 1;
        }

    }

}