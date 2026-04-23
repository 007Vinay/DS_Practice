package LinkedList;

class Node { //user defined data type
    int val;
    Node next; //null

    Node(int val) {
        this.val = val;
    }
}

class Linkedlist{  //user defined data structure
    Node head;  //null
    Node tail; //null
    void addAtHead(int val) {
        Node temp = new Node(val);
        if(head==null) head = tail = temp;
        else{
            temp.next = head;
            head = temp;
        }
    }
    void addAtTail(int val){
        Node temp = new Node(val);
        if(tail==null) head = tail = temp;
        else {
            tail.next = temp;
            tail = temp;
        }
    }

    void display() {
        if(head==null)  return;
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }


}
public class LinkedListDataStructure {
    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.display();
        ll.addAtTail(10);  ll.display();
        ll.addAtTail(20);  ll.display();
        ll.addAtTail(30);  ll.display();
        ll.addAtTail(40);  ll.display();
        ll.addAtHead(50);
        ll.addAtHead(60);
        ll.display();
    }
}
