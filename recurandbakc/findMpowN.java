package recurandbakc;

public class findMpowN {
    public static void main(String[] args) {
        int n=3;
        int m=3;
        System.out.println(  findtwoPowFour(m,n));
    }
    static int findtwoPowFour(int m, int n){
        if(m==1){
            return n;
        }
        return findtwoPowFour(m-1,n)*n;

    }
}
