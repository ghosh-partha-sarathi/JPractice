/*
 * Given a binary array, find the maximum number of consecutive 1s in this array
 * Sample Input: [0,1,1,0,0,1,1,1,0,1,0,0,1,1]
 * Answer: 3
 */
public class MaxConsecutive {
    public static void main(String args[]){
        int[] input = {0,1,1,0,0,1,1,1,0,1,0,0,1,1};
        int maxCount=0;
        int curCount=0;
        for(int index=0; index<input.length; index++){
            if(input[index]==1) curCount++;
            else {
                if(curCount>maxCount) maxCount=curCount;
                curCount=0;
                continue;
            }
        }
        System.out.println("Maximum number of consecutive 1s: " + maxCount);
    }
}
