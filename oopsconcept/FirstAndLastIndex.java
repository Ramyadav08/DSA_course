package oopsconcept;

import java.util.Arrays;

public class FirstAndLastIndex {
    public static void main(String[] args) {
        int[]arr={5,7,7,8,8,9};
        int target=8;
        int[] ans=SearchRange(arr,target);
        System.out.println(Arrays.toString(ans));
    }
     static int[] SearchRange(int[]arr,int target){
        int[]ans={-1,-1};
        int start=Search(arr,target,true);
         int end=Search(arr,target,false);
         ans[0]=start;
         ans[1]=end;

        return ans;

    }
    static int Search(int[]arr,int target,boolean findStartindex){
        int ans=-1;
        int start=0;
        int end=arr.length-1;
       // System.out.println(end);
        while(start<=end){
            int mid=start+(end-start)/2;
            //System.out.println(mid);
            if(target<arr[mid]){
                end=mid-1;
            } else if (target>arr[mid]) {
                start=mid+1;

            }else {
                ans=mid;
               // System.out.println(ans);
                if(findStartindex){
                    end=mid-1;
                   // ans=end;
                }else {
                    start=mid+1;
                    //ans=start;
                }
            }
        }
       // System.out.println(ans);

        return ans;
    }
}
