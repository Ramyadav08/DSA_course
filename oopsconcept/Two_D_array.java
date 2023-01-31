package oopsconcept;

import java.util.Arrays;
import java.util.Scanner;

public class Two_D_array {
    public static void main(String[] args) {
        int[][] arr=new int[3][3];
        System.out.println(arr.length);
        Scanner sc=new Scanner(System.in);
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                arr[row][col]= sc.nextInt();
            }
        }
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();// for the new line
        }
       /* for(int row=0;row< arr.length;row++){
            System.out.println(Arrays.toString(arr[row]));
        }*/
    }
}
