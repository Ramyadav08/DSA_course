package oopsconcept;

import java.util.Scanner;

public class reverse_number {
    public static void main(String[] args) {
        int n,rem,res=0;
        System.out.println("enter the number");
        Scanner sc =new Scanner(System.in);
        n=sc.nextInt();
        while (n!=0){
            rem=n%10;
            res=(res*10)+rem;
            n/=10;
        }
        System.out.println("the reverse number of the given number is "+" "+res);
    }
}
