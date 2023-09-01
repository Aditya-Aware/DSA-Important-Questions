package ImpQuestions;

import org.w3c.dom.Node;

public class Linkedlist {

    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data= data;
            this.next= null;
        }
    }
    public static Node head;
    public static Node tail;

    public static int size;
    public void addFirst(int data){
       Node newNode =new Node(data);
        if (head==null){
            head= tail= newNode;
            return;
        }
        newNode.next= head;
        head= newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if (head==null){
            head= tail= newNode;
            return;
        }
        tail.next= newNode;
        tail=newNode;
    }
    public void print(){
        if (head==null){
            System.out.println("Linked List is Empty! ");
            return;
        }
        Node temp= head;
        while (temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println();
    }

    public void add(int idx, int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode= new Node(data);
        Node temp = head;
        int i=0;
        while (i<idx-1){
            temp=temp.next;
            i++;
        }
    //i=idx-1; temp->prev
        newNode.next = temp.next;
        temp.next=newNode;

    }

    //Removing from the linked list
    public int removeFirst(){
        if(size==0){
            System.out.println("Linked list is Empty ");
            return Integer.MIN_VALUE;

        }else if(size==1){
            int val = head.data;
            head=head.next;
            return val;
        }
        int val= head.data;
        head=head.next;
        return val;
    }

    public int removelast(){
        Node prev = head;
        for (int i =0; i<size-2; i++){
            prev= prev.next;
        }
        int val = prev.next.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }

    public static void main(String[] args) {
        Linkedlist ll= new Linkedlist();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.print();
        ll.add(2,5);
        ll.print();
        ll.removeFirst();
        ll.print();
        ll.removelast();
        ll.print();
    }
}
