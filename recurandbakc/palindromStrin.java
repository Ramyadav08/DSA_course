package recurandbakc;

public class palindromStrin {
    public static void main(String[] args) {
        String st="NOON";
        int n=st.length()-1;
        System.out.println(helper(st,0,n));
    }
    static int helper(String str,int s,int e){
        if(s>=e){
            return 1;
        }
//        if(str[e] != str[s]) {
//            return 0;
//        }

        return helper(str,s+1,e-1);
    }

}
