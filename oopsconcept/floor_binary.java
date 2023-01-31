package oopsconcept;

public class floor_binary {

        public static void main(String[] args) {
            int[]arr={-19,-7,0,1,4,6,9,18,21,23,45,55};
            int target=20;
            int ans=binarysearch(arr,target);
            System.out.println(ans);
        }
        static int binarysearch(int[]arr,int target){
            int start=0;
            int end=arr.length-1;
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
            return end;
        }
    }


