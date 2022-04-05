import java.util.Scanner;

// wap to enter 10 countries and their capitals in two different arrays and
// enter a country name to search int the ..............(use of liner src in strings)

/**
 * $ java country_captial.java
 * enter country name
 * India
 * enter capital name
 * delhi
 * enter country name
 * pak
 * enter capital name
 * islamabad
 * enter country name
 * afganistan
 * enter capital name
 * tehran
 * enter country name
 * japan
 * enter capital name
 * tokyo
 * enter country name
 * ukrain
 * enter capital name
 * kiv
 * enter country name
 * zambia
 * enter capital name
 * lusaka
 * Enter a country name to search
 * japan
 * It's capital is : tokyo
 */
public class country_captial {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String con[] = new String[10];
        String cap[] = new String[10];

        int i, flag = 0;

        for (i = 0; i < 10; i++) {
            System.out.println("enter country name");
            con[i] = sc.nextLine();
            System.out.println("enter capital name");
            cap[i] = sc.nextLine();
        }
        System.out.println("Enter a country name to search ");
        String CountryKey = sc.nextLine();

        for (i = 0; i < 10; i++) {
            if (CountryKey.equalsIgnoreCase(con[i])) {
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            System.out.println("It's capital is : " + cap[i]);

        } else {

            System.out.println("No such country found");
        }
    }

}