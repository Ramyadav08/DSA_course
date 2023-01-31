package oopsconcept;

public class Mountain_peakIndex {
    public static void main(String[] args) {
        int[]arr={0,3,4,5,7,4,3,2,1};
        int ans=peakIndex(arr);
        System.out.println(ans);
    }
    static int peakIndex(int[]arr){
        int start=0;
        int end=arr.length-1;
        while (start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid; //this is for the decreasing part of the array we are not goung to write mid-1 bcz mid may be ans
            }else {
                start=mid+1;
            }
        }
        return start;// or return end bcz in end start ==end so we can return anything start or end
    }
}
