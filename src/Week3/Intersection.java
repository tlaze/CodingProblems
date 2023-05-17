package Week3;

import java.util.LinkedList;

public class Intersection {

    static class Node{
        int data;
        Node next;
        Node (int d){
//            Used to store the data in each node. either and int or null
            data = d;
            next = null;
        }
    }

    public Node Intersection(Node head1, Node head2){
//        Creates the Nodes
        while(head2 !=null){
            Node temp = head1;
            while(temp != null){
                if(temp == head2){
                    return head2;
                }
                temp=temp.next;
            }
            head2=head2.next;
        }
        return null;
    }

    public static void main(String[]args){

        Intersection list = new Intersection();

        Node head1, head2;

//        Creates two linked lists
//        first list : 1 > 8 > 3 > 2 > 9
//        second list: 5 > 2 > 9

        head1 = new Node(5);
        head2 = new Node(1);

        Node newNode = new Node(8);
        head2.next = newNode;

        newNode = new Node(3);
        head2.next.next = newNode;

        newNode = new Node(2);
        head1.next = newNode;
        head2.next.next.next = newNode;

        newNode = new Node(9);
        head1.next.next = newNode;

        head1.next.next.next = null;

        Node intersectionPoint = list.Intersection(head1,head2);

        System.out.println(intersectionPoint.data);

        if(intersectionPoint == null){
            System.out.println("No intersecting points");
        }
        else{
            System.out.println("Intersecting points at: " + intersectionPoint.data);
        }
    }
}
