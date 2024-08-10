package com.practice.programming.personal.general;

/**
 * Write a program to traverse a n x n matrix spirally and print the elements in matrix.
 * Example: input matrix    A   B   C
 *                          D   E   F
 *                          G   H   I
 *          output - A   B   C   F   I   H   G   D   E
 */
public class TraverseMatrixSpirally {
    public static void main(String[] args){
        char[][] inputMatrix = getCharacterMatrix4();
        printElemsSprirally(inputMatrix, 4);
    }

    private static void printElemsSprirally(char[][] inputMatrix, int matrixSize){
        int top=0;
        int bottom=matrixSize-1;
        int left=0;
        int right=matrixSize-1;

        while(top<=bottom && left<=right){
            /*
             * traversing top row
             */
            for(int rightIndex=left; rightIndex<=right; rightIndex++){
                System.out.print(inputMatrix[top][rightIndex]+"\t");
            }
            top++;

            /*
             * traversing right row
             */
            for(int topIndex=top; topIndex<=bottom; topIndex++){
                System.out.print(inputMatrix[topIndex][right]+"\t");
            }
            right--;

            /*
             * traversing bottom row
             */
            for(int leftIndex=right; leftIndex>=left; leftIndex--){
                System.out.print(inputMatrix[bottom][leftIndex]+"\t");
            }
            bottom--;

            /*
             * traversing left column
             */
            for(int bottomIndex=bottom; bottomIndex>=top; bottomIndex--){
                System.out.print(inputMatrix[bottomIndex][left]+"\t");
            }
            left++;
        }
    }

    private static char[][] getCharacterMatrix3(){
        char[][] charMatrix = new char[3][3];
        charMatrix[0][0] = 'A';
        charMatrix[0][1] = 'B';
        charMatrix[0][2] = 'C';
        charMatrix[1][0] = 'D';
        charMatrix[1][1] = 'E';
        charMatrix[1][2] = 'F';
        charMatrix[2][0] = 'G';
        charMatrix[2][1] = 'H';
        charMatrix[2][2] = 'I';
        return charMatrix;
    }

    private static char[][] getCharacterMatrix4(){
        char[][] charMatrix = new char[4][4];
        charMatrix[0][0] = 'A';
        charMatrix[0][1] = 'B';
        charMatrix[0][2] = 'C';
        charMatrix[0][3] = 'D';
        charMatrix[1][0] = 'E';
        charMatrix[1][1] = 'F';
        charMatrix[1][2] = 'G';
        charMatrix[1][3] = 'H';
        charMatrix[2][0] = 'I';
        charMatrix[2][1] = 'J';
        charMatrix[2][2] = 'K';
        charMatrix[2][3] = 'L';
        charMatrix[3][0] = 'M';
        charMatrix[3][1] = 'N';
        charMatrix[3][2] = 'O';
        charMatrix[3][3] = 'P';
        return charMatrix;
    }


}
