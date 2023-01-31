package recurandbakc;

public class stair1Or2stepAtATime {
    public static void main(String[] args) {
        int n=4;
        System.out.println(stair(n));
    }
    static int stair(int n){
        if(n==1 || n==2){
            return n;
        }
        return stair(n-1)+stair(n-2);
    }

}
