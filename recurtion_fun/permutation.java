package recurtion_fun;

import java.util.ArrayList;

public class permutation {
    public static void main(String[] args) {
        permutation("","abd");
    }
    static void permutation(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        for (int i = 0; i <=p.length() ; i++) {  // p.length means the loop will run number of variable
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            permutation(f+ch+s,up.substring(1));

        }
    }

}
