package array;

/**
 * Given a sorted array, remove the duplicates such that each element appears only once.
 * e.g. Input: array = [1, 1, 2]
 *      Output: [1, 2]
 */
public class RepeatedDeletionAlgo{
    private static RepeatedDeletionAlgo deletionAlgo;
    public static void main(String[] args){
        deletionAlgo = new RepeatedDeletionAlgo();
        int[] input = {1, 1, 2};
        deletionAlgo.removeDuplicates(input);
    }

    public int removeDuplicates(int[] nums) {
        int arrLen = nums.length;
        int lastUniqueIndex;
        int curElem;
        if(arrLen > 0) {
            lastUniqueIndex = 0;
            curElem = nums[lastUniqueIndex];
            for(int index=0; index<arrLen; index++){
                if(curElem!=nums[index]){
                    curElem=nums[index];
                    lastUniqueIndex++;
                    nums[lastUniqueIndex] = curElem;
                }
            }
            deletionAlgo.printArray(nums);
            return ++lastUniqueIndex;
        } else {
            return 0;
        }
    }
    
    public void printArray(int[] inputArr){
        int arrLen = inputArr.length;
        System.out.println("[");
        for(int index=0; index<arrLen; index++){
            System.out.print(inputArr[index]+"\t");
        }
        System.out.print("] + \n");
    }
}