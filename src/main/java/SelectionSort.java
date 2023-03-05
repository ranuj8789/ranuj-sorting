import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] inputArray = new int[]{12, 13, 21, 32, 43, 54, 65, 76, 87, 98, 32};
        selectionSort(inputArray);
        System.out.println(Arrays.toString(inputArray));
    }

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            int minimum = i;
            for (int j = i+1; j < array.length; j++) {
                if(array[i]> array[j]){
                    minimum=j;
                }
            }
            int temp= array[i];
            array[i]= array[minimum];
            array[minimum]=temp;
        }
    }
}
