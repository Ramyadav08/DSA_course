package oopsconcept;

public class ClassObjectMethod {//this is class
    public void eat(){ // this is method
        System.out.println("i am eating");
    }
    public int run(){
        int speed=80;
        return speed;

    }

    public static void main(String[] args) {
        ClassObjectMethod dog=new ClassObjectMethod();// this is creating objects
        dog.eat();
        Bird sp=new Bird();

        System.out.println("the speed of the dog is :"+dog.run());
        sp.fly();
    }
}
class Bird{
    public  void fly(){
        System.out.println("the bird is flying ");
    }
}
