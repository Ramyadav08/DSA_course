package recurtion_fun;

public class fibbonachii {
    public static void main(String[] args) {
        int f=fibbo(10);
        System.out.println(f);
    }
    static int fibbo(int n){
        if(n<2){
            return n;
        }
        return fibbo(n-1)+fibbo(n-2);
    }
}
