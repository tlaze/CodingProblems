package Week3;

//Loop Detection: Given a circular linked list, implement an algorithm that returns the node at the beginning of the loop.
//        DEFINITION:
//        Circular linked list: A (corrupt) linked list in which a node's next pointer points to an earlier node, so as to make a loop in the linked list.
//        EXAMPLE
//        Input: A -> B -> C -> D -> E -> C [the same C as earlier]
//        Output: C

import java.util.*;
public class LoopDetection {

    static Node head;

    static class Node{
//        Instantiates a Node
        String data;
        Node next;
        Node(String d){
            data = d;
            next = null;
        }
    }

//    Creates a new node at the front
    static public void addNode(String data){

//      Inserts String data into node
        Node newNode = new Node(data);
//      Next node is the head
        newNode.next = head;
//      Moves the head to the point of the new node
        head = newNode;
    }

    static String loopDetection(Node n){

//        Creates has set to make sure the linked list has no duplicates
        HashSet<Node> hash = new HashSet<Node>();
//      Continues while the node isn't null
        while(n !=null){

//            Adds each node into the hash set
//            if the hashset contains the node already it returns that node
//            else it returns its not a loop
            if(hash.contains(n)){
                return n.data;
            }
            hash.add(n);
            n = n.next;
        }
        return "Not a Loop";
    }


    public static void main(String[] args) {

        LoopDetection list = new LoopDetection();

        list.addNode("A");
        list.addNode("B");
        list.addNode("C");
        list.addNode("D");
        list.addNode("E");
        list.addNode("C");


        list.head.next.next.next.next = list.head;

        System.out.println(loopDetection(head));
    }
}
