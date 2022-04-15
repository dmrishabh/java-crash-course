import java.util.Scanner;

public class srching {
    private static void src() {
        Scanner sc = new Scanner(System.in);
        String name[] = { "Amaan", "Rishabh", "Rakesh", "Rahul", "Virat" }; // new String[5];
        long phone[] = { 965121, 96512, 965122, 965123, 965124 };
        for (int i = 0; i < name.length; i++) {
            System.out.print(name[i] + "\t");
        }
        System.out.println("Enter the name whose phone no. is to be searched");
        String key = sc.nextLine();

        for (int i = 0; i < 5; i++) {

            if (key.equals(name[i]) == true) {
                System.out.println("Search successful");
                System.out.println("name is - " + key);
                System.out.println("phone is - " + phone[i]);
                break;

            } else {
                System.out.println("Src un su....");
                System.out.println("Name not enlisted");
                break;
            }

        }

    }

    public static void main(String[] args) {

        src();

    }
}
