package oopsconcept;

public class Ceiling {
        public static void main(String[] args) {
            int[]arr={-19,-7,0,1,4,6,9,18,21,23,45,55};
            int target=56;
            int ans=binarysearch(arr,target);
            System.out.println(ans);
        }
        static int binarysearch(int[]arr,int target){
            int start=0;
            int end=arr.length-1;
            if(target>=arr[arr.length-1]){ // if target is greater than last index than return -1
                return -1;
            }
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
            return start; // if the element in the array than ans will be smallest  element that is greater or equal to target
        }
    }


