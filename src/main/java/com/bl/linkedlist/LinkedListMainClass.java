package com.bl.linkedlist;
import java.util.LinkedList;

public class LinkedListMainClass {
    public static void main(String[] args) {
        System.out.println("Welecome to DSA problems");

        //  LinkedList<Integer> list = new LinkedList<>();
        SinglyLinkedList<Integer> list=new SinglyLinkedList<>();
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
        list.addLast(40);
        list.addLast(70);
        System.out.print("The elements before sort: ");
        list.display();
        list.sort();
        System.out.print("The elements after sort: ");
        list.display();
//      System.out.println("The size of list is: "+list.size());
//      list.display();
//      list.popLast();
//      list.insertDataAfterGivenKey(40,30);
//      list.deleteData(40);
//      System.out.println("After deleting the size is: "+list.size());

    }
}