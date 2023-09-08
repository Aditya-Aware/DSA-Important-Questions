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

    public static boolean isCycle(){
        Node slow=head;
        Node fast= head;

        while(fast!=null&& fast.next!=null){
            slow= slow.next;
            fast=fast.next.next;

            if (slow==fast){
                return true;
            }
        }
        return false;
    }
//Merge SOrt Begins
    public Node getmid(Node head){
        Node slow=head;
        Node fast= head.next;

        while (fast!=null&& fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;

    }

    public Node merge(Node head1, Node head2){
        Node mergedLL = new Node(-1);
        Node temp= mergedLL;

        while (head1!=null&&head2!=null){
            if (head1.data<=head2.data){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }
            else {
                temp.next =head2;
                head2= head2.next;
                temp=temp.next;
            }
        }
        while (head1 != null) {
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
        }
        while (head2 != null) {
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
        }
        return mergedLL.next;
    }
    public Node mergeSort(Node head){
        if (head==null || head.next==null){
            return head;
        }
        //find mid
        Node mid = getmid(head);

        //left and right merge sort
        Node rightHead= mid.next;
        mid.next=null;
        Node newLeft= mergeSort(head);
        Node newRight= mergeSort(rightHead);

        //merge
        return merge(newLeft , newRight);
    }

    public static void main(String[] args) {
Linkedlist ll= new Linkedlist();
ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.print();
        ll.head=ll.mergeSort(ll.head);
        ll.print();

    }
}
