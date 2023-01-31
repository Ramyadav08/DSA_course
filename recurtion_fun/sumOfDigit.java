package recurtion_fun;

public class sumOfDigit {
    public static void main(String[] args) {
        System.out.println(sumofdigit(13452));
    }
    static int sumofdigit(int n){
        if(n==0){
            return 0;
        }
        return (n%10)+sumofdigit(n/10);
    }
}
