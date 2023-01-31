package sorting;

public class insertion_sort {
    public static void main(String[] args) {
        int[]arr={5,2,3,6,1,4,3};
        int temp,j;
        for (int i = 1; i <arr.length ; i++) {
            temp=arr[i];//temp=2
            j=i;//j=index 1
            while(j>0 && arr[j-1]>temp){
                arr[j]=arr[j-1];// if condtion true then update index 1 element to index 0 element
                j=j-1;// update index 1 to 0 then while loop fail goes to out of loop
            }
            arr[j]=temp;// here j means 0 index so value of j is updated to 5 inplace of 2

        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");

        }
    }
}
