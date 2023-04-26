package array;

import java.util.Arrays;

/**
 * Given an array arr of integers, check if there exist two indices i and j such that :
 *  - i != j
 *  - 0 <= i, j < arr.length
 *  - arr[i] == 2 * arr[j]
 * 
 */

public class CheckDoubleExist {
    public static void main(String args[]){
        CheckDoubleExist checkDoubleObj = new CheckDoubleExist();
        int[] input = {10,2,5,3};      
    }
    
    public boolean checkIfDoubleExist(int[] arr) {
        boolean doubleExist = false;
        Arrays.sort(arr);
        int arrLength = arr.length;
        for(int index=0; index<arrLength; index++){
            System.out.print(arr[index]);
            System.out.println();
        }
        int compareElem = arr[0];
        for(int index=0; index<arrLength-1; index++){
            if(compareElem*2==arr[index]){
                doubleExist=true;
                break;
            } else {
                if(compareElem*2>arr[index+1]){
                    continue;
                } else {
                    compareElem=arr[index+1];
                }
            }
        }
        return doubleExist;
    }
}
