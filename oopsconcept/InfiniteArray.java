package oopsconcept;

public class InfiniteArray {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7,8,9,11,12,13,14,15,16,17,18,22,33,44,55,66,77};
        int target=17;
        int ans=result(arr,target);
        System.out.println(ans);

    }
    static int result(int[]arr,int target){
        //first find the range
        // first start box of size 2
        int start=0;
        int end=1;
        while(target>end){
            int newStart=end+1;
            end=end+(end-start+1)*2;//doubling the size
            start=newStart;
        }
        return binarysearch(arr,target,start,end);
    }
    static int binarysearch(int[]arr,int target,int start,int end){

        while (start <= end) {

            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
