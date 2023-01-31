package oopsconcept;

import java.util.Scanner;

public class sumofDigit {
    public static void main(String[] args) {
        int n,rem,res=0;
        System.out.println("enter the digits");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while (n!=0){
            rem=n%10;
            res=res+rem;
            n/=10;
        }
        System.out.println("the sum of the digits is:"+" "+res);
    }
}
