package sorting;

public class leap_year {
    public static void main(String[] args) {
        int year=2010;
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println("this is leap year");
                }else {
                    System.out.println("this is not leap year");
                }

            }else {
                System.out.println("this is leap year");
            }
        }else {
            System.out.println("this is not leap year");
        }
    }
}
