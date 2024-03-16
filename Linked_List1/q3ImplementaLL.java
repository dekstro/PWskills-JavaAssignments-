package Linked_List1;
class Node{
    int value;
    Node next;
    Node(int value){
        this.value=value;
    }
}
class LL{
    private Node head;
    private Node tail;
    int size;
    //insert at start/head
    public void insertAtHead(int value){
        Node temp=new Node(value);
        if(head==null) head=tail=temp;
        else{
            temp.next=head;
            head=temp;
        }
        size++;
    }
    //insert at end/tail
    public void insertAtTail(int value){
        Node temp=new Node(value);
        if(head==null) head=tail=temp;
        else{
            tail.next=temp;
            tail=temp;
        }
        size++;
    }
    //insert anywhere within list
    public void insert(int idx, int value){
        Node temp=new Node(value);
        if(idx==0){
            insertAtHead(value);
            return;
        }
        if (idx==size) {
            insertAtTail(value);
            return;
        }
        if (idx<0 || idx>size) {
            System.out.println("Invalid index");
            return;
        }
        Node x=head;
        for(int i=0;i<idx-1;i++){
            x=x.next;
        }
        temp.next=x.next;
        x.next=temp;
        size++;
    }
    //delete element
    public void delete(int idx){
        if(head==null) System.out.println("List is Empty");
        if(idx>=size || idx<0){
            System.out.println("Invalid index");
            return;
        }
        if(idx==0){
            head=head.next;
            size--;
            return;
        }
        Node temp=head;
        for(int i=0;i<idx-1;i++){
            temp=temp.next;
        }
        if(temp.next==tail) tail=temp;
        temp.next=temp.next.next;
        size--;
    }
    //to get element
    public int get(int idx){
        if(idx==size-1) return tail.value;
        if (idx<0 || idx>=size) {
            System.out.println("Invalid Index");
            return 0;
        }
        Node temp=head;
        for(int i=0;i<idx;i++){
            temp=temp.next;
        }
        return temp.value;
    }
    //displaying list
    public void print(){
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.value+" ");
            temp=temp.next;
        }
        System.out.println();
    }
}
public class q3ImplementaLL {
    public static void main(String[] args) {
        LL list=new LL();
        list.insertAtHead(100);
        list.print();
        list.insertAtTail(200);
        list.insertAtTail(300);
        list.insertAtTail(400);
        list.print();
        list.insertAtHead(50);
        list.print();
        list.insert(2, 69);
        list.print();
        list.delete(3);
        list.print();
        System.out.println(list.get(2));;
    }
}
