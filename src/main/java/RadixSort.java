import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args) {
        int[] inputArray= new int[]{93,83,73,63,54,43,32,12,21,32,19,20,70,80,90,30,40,50,98989};
        radixSort(inputArray);
        System.out.println(Arrays.toString(inputArray));
    }
    public  static void radixSort(int[] array){
        int maximum= array[0];
        for(int number: array){
            if(maximum < number){
                maximum=number;
            }
        }
        int length=0;
        int divisor=1;
        while(maximum/divisor>0){
            length++;
            divisor=divisor*10;
        }
        divisor=1;

       do{
           int[] digitArray= new int[10];
           for (int i = 0; i < array.length; i++)
               digitArray[(array[i] / divisor) % 10]++;


           for(int i=1; i < digitArray.length;i++){
               digitArray[i]= digitArray[i]+ digitArray[i-1];
           }
           int[] temp= new int[array.length];

           for (int i = array.length - 1; i >= 0; i--) {
               temp[digitArray[(array[i] / divisor) % 10] - 1] = array[i];
               digitArray[(array[i] / divisor) % 10]--;
           }

           for(int i=0 ; i < temp.length;i++) {
               array[i] = temp[i];
           }
           divisor= divisor*10;
       }
       while(maximum/divisor>0);
    }
}
