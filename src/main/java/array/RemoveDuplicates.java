/*  Remove Duplicates from Sorted Array */
/** Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. 
 * The relative order of the elements should be kept the same. 
 * Then return the number of unique elements in nums. Consider the number of unique elements of nums to be k. 
 * to get accepted, you need to do the following things: 
 * 1) Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. 
 *    The remaining elements of nums are not important as well as the size of nums.
 * 2) Return k 
 * Constraints:
 *      1 <= nums.length <= 3 * 104
 *      -100 <= nums[i] <= 100
 *      nums is sorted in non-decreasing order 
 */

public class RemoveDuplicates{
    public static void main(String args[]){

    }

    public int removeDuplicates(int[] nums) {
        int lastUniqueIndex=-1;
        int lastUniqueElem=-101;
        boolean swapNextElem=false;
        for(int index=0; index<nums.length; index++){
            if(nums[index]!=lastUniqueElem){
                if(swapNextElem){
                    nums[lastUniqueIndex+1]=nums[index];        
                } 
                lastUniqueElem=nums[index];       
                lastUniqueIndex++; 
            } else {
                swapNextElem=true;    
            }           
        }
        return ++lastUniqueIndex;
    }
}