package oopsconcept;

public class binarysearch_asscending_or_descending {
    public static void main(String[] args) {
        int[]arr={-12,-2,1,4,5,7,8,9,12,13,44,77};
        //int[]arr={99,98,23,5,4,3,-1,-19};
        int target=78;
        int ans=binaryAscendingOrdescending(arr,target);
        System.out.println(ans);
    }
    static int binaryAscendingOrdescending(int[]arr,int target){
        int start=0;
        int end=arr.length-1;
        boolean isAscd=arr[start]<arr[end];//to array is ascending or descending
        while (start<=end){
            int mid=start+(end-start)/2;
            if(target==arr[mid]){
                return mid;
            }
            if(isAscd){//for the ascending order
                if(target<arr[mid]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
            else { // for the descending order

                if(target>arr[mid]){ //in descending order just change the greater sign
                    end=mid-1;
                }else{
                    start=mid+1;
                }

            }
        }
       // return -1;
        return start;   // for the ceiling smallest element in array that is greater or equal to target ans=12
       // return end; // for the floor greatest element in array that is smallest or equal to target ans =9 arr ascend
    }
}
