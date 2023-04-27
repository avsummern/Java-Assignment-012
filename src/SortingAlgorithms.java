/**
 * @author Adrienne
 * @since version 1.0
 *
 * A less than ideal selection sort
 */

import java.util.Random;
import java.util.Arrays;
public class SortingAlgorithms {
    static int[] selectionSort(int[] numArray){
        for (int i = 0; i< numArray.length; i++){
            int start = i;
            int low = lowest(numArray, start);
            int swapSpot = arrayIndex(numArray, start);
            numArray[swapSpot] = numArray[i];
            numArray[i] = low;
        }
        return numArray;
    }
    static int lowest(int[] numArray, int start){
        int lowest = numArray[start];
        for(int i = start; i<numArray.length; i++){
            if (numArray[i]<lowest){
                lowest = numArray[i];
            }
        }
        return lowest;
    }
    static int arrayIndex(int[] numArray, int start){
        int lowest = numArray[start];
        int arraySpot = start;
        for(int i = start; i<numArray.length; i++){
            if (numArray[i]<lowest){
                lowest = numArray[i];
                arraySpot = i;
            }
        }
        return arraySpot;
    }
    public static void main(String[] args){
        Random rand = new Random();
        int[] numArray = new int[20];
        for(int i = 0; i< numArray.length;i++){
            numArray[i] = rand.nextInt(100);
        }
        System.out.printf("The Original Array is: ");
        System.out.println(Arrays.toString(numArray));
        System.out.println();
        System.out.printf("The Sorted Array is: ");
        System.out.println(Arrays.toString(selectionSort(numArray)));
    }
}
