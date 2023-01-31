package oopsconcept;

import java.util.Scanner;

public class armstrongRange {
    public static void main(String[] args) {
        int i=1,rem,res,n;
        System.out.println("armstronge number between 1 to 500");

        while(i<500){
            n=i;
            res=0;
            while (n>0){
                rem=n%10;
                res=res+(rem*rem*rem);
                n/=10;
            }
            if(res==i){
                System.out.println(i);
            }
            i++;
        }
    }
}
