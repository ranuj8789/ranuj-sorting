import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] inputArray= new int[]{98,88,78,76,65,54,43,32,21,11};
        bubbleSort(inputArray);
    }
    public static void bubbleSort(int[] array){
        boolean isSwap=false;
        do{
            isSwap=false;
           for(int i=0 ; i < array.length-1; i++){
               if(array[i]> array[i+1]){
                   isSwap=true;
                   int temp= array[i];
                   array[i]= array[i+1];
                   array[i+1]= temp;
               }
           }

        }while(isSwap);
        System.out.println(Arrays.toString(array));
    }


}
