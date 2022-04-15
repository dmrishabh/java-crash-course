/**
 * bubble
 */
public class bubble {

    public static void bubbleSort(int a[]) {
        int n = a.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - 1); j++) {
                if (a[j - 1] > a[j]) {
                    temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        int a[] = { 9, 1, 2, 4, 8 };
        bubbleSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }

    }

}
