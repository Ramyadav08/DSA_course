package oopsconcept;

public class Prime_range
{
  /*  static boolean isPrime(int n){
        int count=0;
        if(n<2)
            return false;
        for(int i=2;i<=n;i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int lower=1;
        int higher=100;
        for(int i=lower;i<=higher;i++)
            if(isPrime(i))
                System.out.println(i);
    }*/


    public static void main(String[] args) {
        int temp=0;
        for(int n=1;n<=100;n++){
            if(n>=2){
                for(int i=2;i<=n-1;i++){
                    if(n%i==0){
                        temp=temp+1;
                    }

                }
                if(temp==0){
                    System.out.println(n);
                }
                else {
                    temp=0;
                }
            }
        }
    }
}