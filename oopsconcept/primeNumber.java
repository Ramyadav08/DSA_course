package oopsconcept;

import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        int n,i,m=0,flag=0;
        System.out.println("enter the number to check prime number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=n/2;
        for(i=2;i<=m;i++){
            if(n%i==0){
                System.out.println(n+" "+" is not prime");
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println(n+" "+" is prime");
        }
    }
}
