package oopsconcept;

import java.util.Scanner;

public class palindrome_numer {
    public static void main(String[] args) {
        int n,rem,res=0,tem;
        System.out.println("enter the number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        tem=n;
        while (n!=0){
            rem=n%10;
            res=(res*10)+rem;
            n/=10;
        }
        if(tem==res){
            System.out.println("this is palindrome number");
        }
        else
            System.out.println("this is not palindrome number");
    }
}
