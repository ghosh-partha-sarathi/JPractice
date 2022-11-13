public class DuplicateZeros {
    public static void main(String args[]){
        int[] input = {1,0,2,3,0,4,5,0};
        DuplicateZeros dupZerosObj = new DuplicateZeros();        
        dupZerosObj.duplicateZeros(input);
    }

    public void duplicateZeros(int[] arr) {
        for(int index=0; index<arr.length-1; index++){
            if(arr[index]==0){
                int start = index;
                for(int ind=arr.length-1; ind>start; ind--){
                    arr[ind] = arr[ind-1];
                }
                index++;
            }
        }
        for(int index=0; index<arr.length; index++){
            System.out.print(arr[index]+"\t");
        }
    }
}
