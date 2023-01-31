package pattern;

public class number_pattern {
    public static void main(String[] args) {
        pattern5(5);
    }
    static void pattern1(int n){
        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <=row ; col++) {
                System.out.print(col+" ");

            }
            System.out.println();

        }
    }
    static void pattern2(int n){
        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <=row ; col++) {
                System.out.print(row+" ");

            }
            System.out.println();

        }
    }
    static void pattern3(int n){
       int count=0;
        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <=row ; col++) {
                count=count+1;
                System.out.print(count+" ");

            }
            System.out.println();

        }
    }
    static void pattern4(int n){
        for (int row = 1; row <=n ; row++) {
            for (int col = row; col >=1 ; col--) {
                System.out.print(col+" ");

            }
            System.out.println();

        }
    }
    static void pattern5(int n){
        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <=row ; col++) {
                System.out.print(col+" ");

            }


            for (int col = row-1; col >=1 ; col--) {
                System.out.print(col+" ");

            }
            System.out.println();

        }
    }
}
