package oopsconcept;

import org.w3c.dom.ls.LSOutput;

public class Maximum_inarray {
    public static void main(String[] args) {
        int[]arr={1,2,23,9,18};
        System.out.println(max(arr));
    }
    static int max(int[] arr){
        int maxVal=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>maxVal){
                maxVal=arr[i];
            }
        }
        return maxVal;
    }

}
