package programming.personal.arrays;

/**
 * Given an integer array nums, move all 0's to the end of it while maintaining 
 * the relative order of the non-zero elements.
 * Note: operations should be done in-place without creating copy of the input array.
 * Constraints:
 *      1 <= nums.length <= 104
 *      -231 <= nums[i] <= 231 - 1
 * e.g. 
 *      Input: nums = [0,1,0,3,12]
 *      Output: [1,3,12,0,0]
 */
public class MoveZeroesToEnd {
    public void moveZeroes(int[] nums) {
        
    }

    public int[] moveZeroesToEnd(int[] nums) {
        // {0, 1, 3, 8, 0, 0, 5, 7, 4}
        int inputLen = nums.length;
        if(inputLen>0){
            int lastZeroIndex = -1;
            for(int index=0; index<inputLen; index++){
                if(nums[index]==0 && lastZeroIndex<0) {
                    lastZeroIndex=index;
                } else if (nums[index]!=0 && lastZeroIndex>=0) {
                    nums[lastZeroIndex]=nums[index];
                    nums[index] = 0;
                    lastZeroIndex++;
                }
            }
        }
        return nums;
    }
}
