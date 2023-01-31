package recurtion_fun;

/*public class findsubset {
    public static void main(String[] args) {
        subset("","abd");

    }
    static void subset(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        subset(p,up.substring(1)); // ignoring element
        subset(ch+p,up.substring(1));// taking element
    }
}*/

import java.util.ArrayList;

public class findsubset {
    public static void main(String[] args) {
        System.out.println(subset("","abd"));

    }
    static ArrayList<String> subset(String p, String up){
        if(up.isEmpty()){
          ArrayList<String>list=new ArrayList<>();
          list.add(p);
          return list ;
        }
        char ch=up.charAt(0);
        ArrayList<String>left=subset(p,up.substring(1)); // ignoring element
        ArrayList<String>right=subset(ch+p,up.substring(1));// taking element
        left.addAll(right);
        return left;
    }
}
