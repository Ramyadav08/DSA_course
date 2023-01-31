package oopsconcept;

public class GetAndSet {
    String name;
    int age;
    int salary;
    public void set(String n,int a,int s){
        this.name=n;
        this.age=a;
        this.salary=s;
    }

    void displayGet(){
        System.out.println("the name of the person is "+name);
        System.out.println("the age of the person is:"+ age);
        System.out.println("the salary of the person is:"+salary);
    }

    public static void main(String[] args) {
        GetAndSet person=new GetAndSet();
        person.set("ram",21,100000);
        person.displayGet();


    }
}
