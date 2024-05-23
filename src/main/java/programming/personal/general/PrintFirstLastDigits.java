package programming.personal.general;

/**
 * Given an integer input print the first and last digits and their sum.
 * e.g. input=435257
 *      output= 4, 7, 11
 */
public class PrintFirstLastDigits {
    private static int input=435257;
    public static void main(String[] args){
        PrintFirstLastDigits printDigitsObj = new PrintFirstLastDigits();
        // input=10000;
        printDigitsObj.printFirstLastDigits(input);
    }

    private void printFirstLastDigits(int input){
        int lastDigit=0;
        int sum=0;

        if(input>0 && input/10!=0){
            lastDigit = input%10;
            while(input/10>0 && input>=10){
                input=input/10;
            }
        }

        sum=input+lastDigit;
        System.out.println(input +"\t"+ lastDigit +"\t"+ sum);
    }
}
