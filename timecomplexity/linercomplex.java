package timecomplexity;

public class linercomplex {
    public static void main(String[] args) {
        int[]arr={2,3,4,5,6,7};
        int target=5;
        int ans=linercomplex(arr,target);
        System.out.println(ans);
    }

    static  int linercomplex(int[]arr,int target){
        int count=0;
        if(arr.length==0){
            //return -1;
            return count;
        }
        for (int i = 0; i < arr.length; i++) {
            count++;
            int element=arr[i];
            if(element==target){

                return count;
            }

        }
        return -1;
    }
}
