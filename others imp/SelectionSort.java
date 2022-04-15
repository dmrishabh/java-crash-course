// making a class selection sort
public class SelectionSort {
    // making a function to sort an array by using selection sort technique
    static void SelectionS(int arr[]) {

        int length = arr.length;
        for (int i = 0; i < length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + "\t");
            System.out.println();

        }
    }

    public static void main(String[] args) {

        int array[] = { 23, 15, 17, 1, 16, 14, 10 };
        System.out.println("OLD UNSORTED ARRAY");
        printArray(array);
        SelectionS(array);
        System.out.println("NEW SORTED ARRAY");
        printArray(array);

    }

}
