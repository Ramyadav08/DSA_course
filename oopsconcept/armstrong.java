package oopsconcept;

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        int n ,tem,rem,res=0;
        System.out.println("enter the number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        tem=n;
        while(tem!=0){
            rem=tem%10;
            res=res+(rem*rem*rem);
            tem/=10;
        }
        if(res==n){
            System.out.println("this is armstrong number");
        }
        else {
            System.out.println("this is not armstrong number");
        }
    }
}
