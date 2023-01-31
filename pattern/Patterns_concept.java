package pattern;

public class Patterns_concept {
    public static void main(String[] args) {
        pattern6(5);
    }
    static void pattern1(int n){
        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <=row ; col++) {
                System.out.print("*");

            }
            System.out.println();

        }
    }
    static void pattern2(int n){
        for (int row = 1; row <=n ; row++) {
            for (int col = row; col <=n ; col++) {
                System.out.print("*");

            }
            System.out.println();

        }
    }

    static void pattern3(int n){
        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <=row ; col++) {
                System.out.print("*");

            }
            System.out.println();

        }
        for (int row =1; row <=n ; row++) {
            for (int col = row+1; col <=n ; col++) {
                System.out.print("*");

            }
            System.out.println();

        }
    }

    static void pattern5(int n){
        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <=n-row ; col++) {
                System.out.print(" ");

            }
            for(int col=1;col<=row;col++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
    static void pattern6(int n){
        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <=row-1 ; col++) {
                System.out.print(" ");

            }
            for(int col=1;col<=n-row;col++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
