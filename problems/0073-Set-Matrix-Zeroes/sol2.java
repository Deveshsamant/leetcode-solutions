// ==========================================================
// 73. Set Matrix Zeroes
// Difficulty : Medium
// Language   : Java
// Solution   : #2
// Runtime    : 1 ms (Beats 96%)
// Memory     : 47.5 MB (Beats 61%)
// Link       : https://leetcode.com/problems/set-matrix-zeroes/
// ==========================================================

class Solution {
    public void setZeroes(int[][] matrix) {
        boolean firstrow=false;
        boolean firsttempdigit=false;
        boolean firstcol=false;
        //first row
        if(matrix[0][0]==0){
            firsttempdigit=true;
        }
        for(int i=1;i<matrix[0].length;i++){
            if(matrix[0][i]==0){
                firstrow=true;
                break;
            }
        }
        //first col
        for(int i=0;i<matrix.length;i++){
            if(matrix[i][0]==0){
                firstcol=true;
                break;
            }
        }
        //setting first row and first col zero
        for(int i=1;i<matrix.length;i++){
            for(int j=1;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    matrix[0][j]=0;
                    matrix[i][0]=0;
                }
            }
        }

        //making  rows zero
        for(int i=1;i<matrix[0].length;i++){
            if(matrix[0][i]==0){
                for(int j=1;j<matrix.length;j++){
                    matrix[j][i]=0;
                }
            }
        }
        //making col zero
        for(int i=1;i<matrix.length;i++){
            if(matrix[i][0]==0){
                for(int j=1;j<matrix[0].length;j++){
                    matrix[i][j]=0;
                }
            }
        }

        //setting first col zero
        if(firstcol){
            for(int j=0;j<matrix.length;j++){
                matrix[j][0]=0;
            }
        }
        //setting first row zero
        if(firstrow || firsttempdigit){
            for(int j=0;j<matrix[0].length;j++){
                matrix[0][j]=0;
            }
        }




    }
}