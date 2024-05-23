package programming.personal.arrays;

/*
 * Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. 
 * Return the number of elements in nums which are not equal to val. (order of the elements may be changed)
 * Consider the number of elements in nums which are not equal to val be k, to get accepted, 
 *      you need to do the following things:
 * 1)   Change the array nums such that the first k elements of nums contain the elements which are not equal to val. 
 *      The remaining elements of nums are not important as well as the size of nums
 * 2)   Return k.
 */

public class RemoveElement {

    public static void main(String args[]){

    }

    public int solutionFirst(int[] nums, int val) {
        int numsLength = nums.length;
        int result = 0;
        int ind2=numsLength-1;
        if(nums.length == 0) { 
            return result;
        } else {
            for(int ind1=0; ind1<=ind2; ind1++){
                if(nums[ind1]==val){
                    for(; ind2>ind1; ind2--){
                        if(nums[ind2]!=val){
                            nums[ind1] = nums[ind2];
                            nums[ind2] = val;
                            break;
                        }                   
                    }    
                }    
            }
            for(int index=0; index<numsLength; index++){
                if(nums[index]==val){
                    break;
                } else result++;
            }
            return result;
        }
    }

    public int solutionSecond(int[] nums, int val){
        int result = 0;
        int replaceIndex=0;
        for(int index=0; index<nums.length; index++){
            if(nums[index]!=val){
                int temp = nums[replaceIndex];
                nums[replaceIndex] = nums[index];
                nums[index]= temp;
                replaceIndex++;
            }
        }
        result = replaceIndex;
        return result;
    }
 }