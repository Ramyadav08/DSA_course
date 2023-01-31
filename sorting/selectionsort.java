package sorting;

import java.util.Arrays;

public class selectionsort {
    public static void main(String[] args) {
        int[]arr={4,1,3,6,7,9};
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void sort(int array[])
    {
        int n = array.length;
// Loop to increase the boundary of the sorted array
        for (int i = 0; i < n-1; i++)
        {
// Finding the smallest element in the unsorted array
            int min_element = i;
            for (int j = i+1; j < n; j++)
                if (array[j] < array[min_element])
                    min_element = j;
            /* Swap the smallest element from the unsorted array with the last element of the sorted array */
            int temp = array[min_element];
            array[min_element] = array[i];
            array[i] = temp;
        }
    }
}
