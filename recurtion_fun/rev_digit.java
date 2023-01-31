package recurtion_fun;

public class rev_digit {
    public static void main(String[] args) {
        System.out.println(recdigit(1234));
    }
    static int recdigit(int n){
        if(n==0){
            return n;
        }
        return (n%10)+recdigit(n/10);
    }
}
