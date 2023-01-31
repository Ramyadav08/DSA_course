package recurtion_fun;

public class fibo {
    public static void main(String[] args) {
        System.out.println(fib(10));
    }
    static int fib(int n){
        return (int)(Math.pow(((1+Math.sqrt(5))/2),n)/Math.sqrt(5));
    }
}
