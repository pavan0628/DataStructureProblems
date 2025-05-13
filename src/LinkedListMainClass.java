import java.util.LinkedList;

public class LinkedListMainClass {
    public static void main(String[] args) {
        System.out.println("Welecome to DSA problems");

      //  LinkedList<Integer> list = new LinkedList<>();
        SinglyLinkedList list=new SinglyLinkedList();
//        list.addFirst(56);
//        list.addFirst(30);
//        list.addFirst(70);
//        list.addLast(56);
//        list.addLast(30);
//        list.addLast(70);

//        list.addLast(56);
//        list.addLast(70);
//        list.insertInBetween(30);
//        list.display();
//        list.pop();

        list.addLast(56);
        list.addLast(30);
        list.addLast(70);
        list.display();
        list.popLast();
        list.display();
    }
}