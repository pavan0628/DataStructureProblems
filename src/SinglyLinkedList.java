import java.util.Collection;
import java.util.List;

public class SinglyLinkedList {
    Node head;
    Node next;

    public void addFirst(Object data){
        Node node = new Node(data);
        Node temp = head;
        this.head = node;
        node.next = temp;
    }
    public void addLast(Object data){
        Node node = new Node(data);
        if(this.head == null)
        {
            this.head = node;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
    }
    public void insertInBetween(Object data){
        if(head == null)
        {
            System.out.println("no data in list");
            return;
        }
        Node node = new Node(data);
        Node temp = head;
        for(int i=1;i<this.size()/2;i++)
        {
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;
    }

    public int size(){
        int size=1;
        Node temp=head;
        while(temp.next!=null){
            size++;
            temp=temp.next;
        }
        return size;
    }

    public void display(){
        Node temp = this.head;
        if(temp == null) {
            System.out.println("no data in the list,..");
            return;
        }

        while(temp.next!=null)
        {
            Node node = temp;
            System.out.print(node.data+"-->");
            temp = node.next;
        }
        System.out.println(temp.data);
    }

}
