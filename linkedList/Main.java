package linkedList;

public class Main {
    public static void main(String[] args) {
        LL list=new LL();
        list.insertfirst(5);
        list.insertfirst(8);
        list.insertfirst(9);
        list.insertlast(17);
        list.insertAtindex(18,3);
        list.display();
    }
}
