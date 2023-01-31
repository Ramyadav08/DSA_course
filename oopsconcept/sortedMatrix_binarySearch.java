package oopsconcept;

import java.util.Arrays;

public class sortedMatrix_binarySearch {
    public static void main(String[] args) {
        int[][]matrix={
                {10,20,30,40},
                {15,25,35,45},
                {18,28,38,48},
                {19,29,39,49}
        };
        int target=45;
        int[]ans=Search(matrix,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[]Search(int[][]matrix,int target){
        int row=0;
        int col=matrix.length-1;
        while(row<matrix.length && col>=0){
            if(target==matrix[row][col]){
                return new int[]{row,col};

            }
            if(matrix[row][col]<target){
                row++;
            }else {
                col--;
            }
        }
        return new int[]{-1,-1};

    }
}
