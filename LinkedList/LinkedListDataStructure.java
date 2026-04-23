package LinkedList;

class Linkedlist{  //user defined data structure
    Node head;  //null
    Node tail; //null
    int size;

    boolean search(int val) {
        if (head == null) return false;
        Node temp = head;
        int idx = 0 ;
        while (temp != null) {
            if (temp.val == val) return true;
                temp = temp.next;
                idx++;
        }
        return false;
    }


    void addAtHead(int val) {
        Node temp = new Node(val);
        if(head==null) head = tail = temp;
        else{
            temp.next = head;
            head = temp;
        }
        size++;
    }
    void addAtTail(int val){
        Node temp = new Node(val);
        if(tail==null) head = tail = temp;
        else {
            tail.next = temp;
            tail = temp;
        }
        size++;

    }
    void  deleteAtHead(){
        if(head==null){
            System.out.println("List is Empty!");
            return;
        }
       head = head.next;
        if(head==null) tail=null;
        size--;
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

    void insert(int val, int idx) {
        if(idx<0 || idx>size) System.out.println("Invalid Index");

        else if(idx==0) addAtHead(val);
        else if(idx==size) addAtTail(val);
        else{
            Node temp = head;
            for(int i=1; i<=idx-1; i++){
                temp = temp.next;
            }
            Node t = new Node(val);
            t.next = temp.next;
            temp.next = t;
            size++;
        }
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
        ll.deleteAtHead(); ll.display();
        System.out.println(ll.size);

        ll.insert(45,2); ll.display();

    }
}
