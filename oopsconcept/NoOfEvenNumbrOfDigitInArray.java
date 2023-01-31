package oopsconcept;

public class NoOfEvenNumbrOfDigitInArray {
    public static void main(String[] args) {
        int[]num={12,234,1,2,22,3333,3434344};
        int ans=findNumber(num);
        System.out.println(ans);
    }
    static int findNumber(int[]num){
        int count=0;
        for(int n:num){
            if(even(n)){
                count++;
            }
        }
        return count;
    }

    private static boolean even(int n) {
        int numOfdigit=digit(n);
        return numOfdigit%2==0;

    }
    static int digit(int n){
        int count=0;
        while (n>0){
            count++;
            n=n/10;
        }
        return count;

    }
}
