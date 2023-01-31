package oopsconcept;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr={1,2,3,23,9,12};
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
        swap(arr,1,3);// 1 and 3 are the index number
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[]arr,int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;

    }
}
