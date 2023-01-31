package recurtion_fun;

public class rotated_array {
    public static void main(String[] args) {
        int[]arr={5,6,7,8,9,1,2,4};
        int target=1;
        System.out.println(rbs(arr,target,0,arr.length));
    }
    static int rbs(int[]arr,int target,int s,int e){
        if(s>e){
            return -1;
        }
        int m=s+(e-s)/2;
        if(arr[m]==target){
            return m;
        }
        //case for the sorted array
        if(arr[s]<=arr[m]){
            if(target>=arr[s] && target<=arr[m]){ // for the range is target lies between s to mid or not
                return rbs(arr,target,s,m-1); // end will be m-1

            }
            else {
                return rbs(arr,target,m+1,e); // s will be m+1 if element donot lies in between s and mid
            }
        }

        if(target>=arr[m]&&target<=arr[e]){ // if element is in another range
            return rbs(arr,target,m+1,e); // s will m+1;

        }else {
            return rbs(arr,target,m-1,e);
        }

    }
}
