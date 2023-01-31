package oopsconcept;

import java.util.*;

public class palindrome_string {
    public static void main(String[] args) {
        String input_str,revStr="";
        System.out.println("enter the string ");
        Scanner sc=new Scanner(System.in);
        input_str=sc.next();
        int strLength=input_str.length();

        if(input_str!=null){
            for(int i=(strLength-1);i>=0;--i) {
                revStr = revStr +input_str.charAt(i);
            }
            if(revStr.equals(input_str)){
                System.out.println("this is palindrome string");
            }else {
                System.out.println("this is not palindrome string");
            }
        }
    }
}
