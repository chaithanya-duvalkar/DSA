import java.util.*;

public class LinkedList {

    //create dummy node
    public static class Node
    {
        int data;
        Node next;

        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }

    public static Node Head;
    public static Node Tail;

    public void addFirst(int data)
    {
        Node newNode=new Node(data);
        //when there is one node
        if(Head==null)
        {
            Head=Tail=newNode;
        }
        else{
             //when there is more than one node
        newNode.next=Head; //linking the head address to the new node
        Head=newNode;
        }
    }


    //print the list
    public void printList()
    {
        Node temp=Head;

        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        LinkedList ll=new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);

        ll.printList();
    }
}
