package recurandbakc;

public class sumoftheNnum {
    public static void main(String[] args) {
        int n=5;
        System.out.println(sumoftheNnum(n));
    }
    static int sumoftheNnum(int n){
        if(n==1){
            return 1;
        }
        return sumoftheNnum(n-1)+n;
    }
}
