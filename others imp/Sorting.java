public class Sorting {

    public static void sort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            // it should be like this
            for (int index = i + 1; index < n; index++) {
                if (arr[index] < arr[minIndex]) {
                    minIndex = index;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 70, 30, 31, 32, 45, 65, 20 };
        System.out.println("Array before");
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        sort(arr);
        System.out.println("Array after sorting ");
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + "\t");
        }
    }
}
