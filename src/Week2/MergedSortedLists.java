package Week2;

//Mergek Sorted Lists
//        You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.
//        Merge all the linked-lists into one sorted linked-list and return it.
//
//        Example1:
//        Input: lists = [[1,4,5],[1,3,4],[2,6]]
//        Output:[1,1,2,3,4,4,5,6]
//        Explanation: The linked-lists are:
//        [
//        1->4->5,
//        1->3->4,
//        2->6
//        ]
//        merging them into one sorted list:
//        1->1->2->3->4->4->5->6
//
//        Example2:
//        Input: lists= []
//        Output: []
//
//        Example3:
//        Input: lists = [[]]
//        Output: []
//
//        Constraints:
//
//
//
//        k == lists.length
//
//        0 <= k <= 104
//
//        0 <= lists[i].length <= 500
//
//        -104 <= lists[i][j] <= 104
//
//        lists[i] is sorted in ascending order.
//
//        The sum of lists[i].length will not exceed 104.

import java.util.Collections;
import java.util.LinkedList;

public class MergedSortedLists {

    public static void main(String args[]){

//        Instantiates 3 separate LinkedLists and adds values to each LinkedList
        LinkedList<Integer> listA = new LinkedList<>();
        listA.add(1);
        listA.add(4);
        listA.add(5);

        LinkedList<Integer> listB = new LinkedList<>();
        listB.add(1);
        listB.add(3);
        listB.add(4);

        LinkedList<Integer> listC = new LinkedList<>();
        listC.add(2);
        listC.add(6);

        System.out.println(MergedSortedLists(listA,listB,listC));
    }

    public static LinkedList<Integer> MergedSortedLists(LinkedList<Integer> listA, LinkedList<Integer> listB, LinkedList<Integer> listC){

        LinkedList<Integer>mergedLinkedList = new LinkedList<>();

//        Iterates through each LinkedList and pushes each value to the merged list.
        for(int i = 0; i < listA.size(); i++){
            mergedLinkedList.push(listA.get(i));
        }
        for(int j = 0; j < listB.size(); j++){
            mergedLinkedList.push(listB.get(j));
        }
        for(int k = 0; k < listC.size(); k++){
            mergedLinkedList.push(listC.get(k));
        }

//        Uses Collections package to sort the merged list
        Collections.sort(mergedLinkedList);

        return mergedLinkedList;
    }
}
