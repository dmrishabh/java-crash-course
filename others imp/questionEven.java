import java.util.Scanner;

public class questionEven {

    // ! wap to accept 20 no. and print only the even no. together

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int ar1[] = new int[20];
        int ar2[] = new int[20];
        int index = 0;
        for (int i = 0; i < 20; i++) {

            System.out.println("enter value");
            ar1[i] = sc.nextInt();
            if (ar1[i] % 2 == 0) {

                ar2[index] = ar1[i];
                index++;

            }

        }
        System.out.println("Even array is");
        for (int i = 0; i < index; i++) {

            System.out.print(ar2[i] + "\t");

        }

    }

}
