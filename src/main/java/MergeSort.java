import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] inputArray = new int[]{98,87,76,65,54,43,32,21,11};
        mergeSort(inputArray);

    }
    public static int[] mergeSort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int[] leftArray= Arrays.copyOfRange(arr,0,arr.length/2);
        int[] rightArray= Arrays.copyOfRange(arr,arr.length/2,arr.length);
        return merge(mergeSort(leftArray),mergeSort(rightArray));
    }
    public static int[] merge(int[] firstArray, int[] secondArray){
        int firstArrayIndex=0;
        int secondArrayIndex=0;
        int newArrayIndex=0;
        int[] newArray= new int[firstArray.length+ secondArray.length];
        do{
            if(firstArray[firstArrayIndex]< secondArray[secondArrayIndex]){
                newArray[newArrayIndex]= firstArray[firstArrayIndex];
                firstArrayIndex++;
                newArrayIndex++;
            }else{
                newArray[newArrayIndex]= secondArray[firstArrayIndex];
                secondArrayIndex++;
                newArrayIndex++;
            }
        }while(firstArrayIndex< firstArray.length && secondArrayIndex < secondArray.length);
        for(int i= firstArrayIndex; i < firstArray.length; i++){
            newArray[newArrayIndex]= firstArray[i];
        }
        for(int i= secondArrayIndex; i < secondArray.length; i++){
            newArray[newArrayIndex]= secondArray[i];
        }
        return newArray;
    }
}
