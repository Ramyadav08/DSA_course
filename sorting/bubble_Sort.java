package sorting;

import java.util.Arrays;

public class bubble_Sort {
    public static void main(String[] args) {
        int[]arr={4,3,2,5,1,6,9,7};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[]arr){
        boolean swapped;// this is for when array is already sorted
        for (int i = 0; i <arr.length ; i++) {  // for the pass of the element or outer loop
            swapped=false;
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }

            }
            if(!swapped){
                break;
            }

        }
    }
}
