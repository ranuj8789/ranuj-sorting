import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] inputArray = new int[]{98, 54, 23, 43, 56, 76, 12, 34, 65, 87, 98, 12, 17, 12, 65, 43};
        quickSort(inputArray, 0, inputArray.length - 1);
        System.out.println(Arrays.toString(inputArray));
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (arr == null) {
            return;
        }
        if (low<high) {
            int pi = partitionArray(arr, low, high);
            quickSort(arr, pi + 1, high);
            quickSort(arr, low, pi - 1);
        }
    }

    public static int partitionArray(int[] arr, int low, int high) {
        int index = low - 1;
        for (int i = low; i < high; i++) {
            if (arr[i] < arr[high]) {
                index++;
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
            }
        }
        int temp = arr[high];
        arr[high] = arr[index + 1];
        arr[index + 1] = temp;
        return index + 1;
    }
}
