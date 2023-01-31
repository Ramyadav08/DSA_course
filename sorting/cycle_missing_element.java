package sorting;

public class cycle_missing_element {
    public static void main(String[] args) { //if range(0,n)
        int[]arr={3,0,1};

        System.out.println(sort(arr));

    }
    static int sort(int[]arr){
        int i=0;
        while( i<arr.length){
            int correctindex=arr[i]; // bcz range start from 0
            if(arr[i]<arr.length &&arr[i]!=arr[correctindex]){
                swap(arr,i,correctindex);
            }else {
                i++;
            }


        }
        // for the missing index
        for (int index = 0; index < arr.length; index++) {
            if(arr[index]!=index){
                return index;
            }

        }
        return arr.length;
    }
    static void swap(int[]arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
