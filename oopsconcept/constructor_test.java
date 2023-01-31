package oopsconcept;

public class constructor_test {
    String fname;
    String lname;
    public constructor_test(String fname,String lname){
        this.fname=fname;
        this.lname=lname;
    }
    public static void main(String[] args) {
        constructor_test t=new constructor_test("ram","yadav");
        System.out.println(t.fname+" "+t.lname);
        constructor_test t2=new constructor_test("ramrekha","yadvanshi");
        System.out.println(t2.fname+" "+t2.lname);

    }
}
