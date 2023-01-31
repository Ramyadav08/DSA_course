package sorting;

import java.util.Arrays;

public class mergelabpra {
    public static void main(String[] args) {
        int[]arr={7,2,5,9,1,10,4};
        arr=mergelabpra(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int[]mergelabpra(int[]arr){
        if(arr.length==1){  //if only one element then return element
            return arr;
        }
        int mid=arr.length/2; //divide array into half
        int[]left=mergelabpra(Arrays.copyOfRange(arr,0,mid));//left portion of the array
        int[]right=mergelabpra(Arrays.copyOfRange(arr,mid,arr.length));// right portion of the array
        return merge(left,right);

    }
    private static int[]merge(int[]first,int[]second){
        int[]mix=new int[first.length+ second.length];//it will store the merge element
        int i=0; // it is for the left portion
        int j=0;// it is for the right portion
        int k=0;// it is for the mix portion
        while (i<first.length && j<second.length){
            if(first[i]<second[j]){ // it compare the i of left array with the j of the right array
                mix[k]=first[i]; //and assign the i value into the k of mix
                i++; // move forward
            }else {
                mix[k]=second[j];
                j++;
            }
            k++;
        }

       while (i<first.length){ //it is for the rest element of the left array
           mix[k]=first[i];
           i++;
           k++;
       }
       while (j<second.length){ //it is for the rest element of the right array
           mix[k]=second[j];
           j++;
           k++;
       }
       return mix;
    }
}
