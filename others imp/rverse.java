public class rverse {

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    // public static void revArr(int arr[], int length) {
    // int tempArr[] = new int[length];
    // int tempLen = length;
    // for (int i = 0; i < length; i++) {
    // tempArr[tempLen - 1] = arr[i];
    // tempLen = tempLen - 1;
    // }
    // System.out.println("reversed array is");
    // printArr(tempArr);
    // }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 200 };
        int length = arr.length;
        System.out.println("Normal array");
        printArr(arr);
        System.out.println();
        // revArr(arr, length);

        System.out.println("reversed array");

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + "\t");

        }

    }
}