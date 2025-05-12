import java.util.Collection;
import java.util.List;

public class SinglyLinkedList {
    Node head;
    Node next;

    public void addFirst(Object data){
        Node node = new Node(data);
        if(this.head == null)
        {
            this.head = node;
        }
        else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
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
