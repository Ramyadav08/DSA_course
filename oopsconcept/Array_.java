package oopsconcept;

import java.util.Scanner;

public class Array_ {
    public static void main(String[] args) {
        int[]arr=new int[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();

        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
