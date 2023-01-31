package oopsconcept;


import java.util.Arrays;

public class searchin_2D_array {
    public static void main(String[] args) {
        int[][]arr={
                {23,4,1},
                {18,12,3,9},
                {78,88,99,56},
                {18,12}
        };
        int target=99;
        int[]ans=search_inarr(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[]search_inarr(int[][]arr,int target){
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }

}
