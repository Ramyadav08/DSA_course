package oopsconcept;

public class Linearshearch_inRange {
    public static void main(String[] args) {
        int[]arr={1,2,4,5,6,7,-1,9,191,-192};
        int target=1;
        int ans=linearSearch(arr,target,2,8);
        System.out.println(ans);// it will print index number
    }

    static int linearSearch(int[] arr, int target,int start,int end) {
        if(arr.length==0){  //if array length is zero
            return -1;
        }
        for (int i = start; i <end ; i++) { //it will check for every element
            int element=arr[i]; // the value of the index assign to element
            if(element==target){
                return i;
            }

        }

        return -1; // if the element is not found
    }
}
