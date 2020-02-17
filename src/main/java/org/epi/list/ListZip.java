package org.epi.list;

/**
 * In this Problem we have to define the zip of list
 * The Zip of List to be the list consisting of the interleaving of the nodes numbered 0,1,2,..
 * with the nodes numbered n-1, n-2, n-3 ,....
 *
 * Approach1 : In this we every time find the tail of the list and append it to the head this approach takes Space Complexity
 * of O(1) but the time complexity is O(n^2)
 *
 * Approach2: The previous approach was taking O(n^2) because we have to find out the tail every time
 * But as we know that to get head of the List it takes constant time of O(1)
 * So we can compute the reverse of the second half of the list and then interleave the elements from first half and
 * second half
 */
public class ListZip {

    public static Node zipListApproach1(Node head) {

        Node tmpHead = head;
        Node tmp = null;
        while(tmpHead != null && tmpHead.getNext() != null) {
            //Find the Tail
            Node tail = tmpHead;
            Node tailPrev = null;
            while (tail.getNext() != null) {
                tailPrev = tail;
                tail = tailPrev.getNext();
            }
            tailPrev.setNext(null);
            tmp = tmpHead.getNext();
            tail.setNext(tmp);
            tmpHead.setNext(tail);
            tmpHead = tmp;
        }
        return head;
    }

    public static Node zipListApproach2(Node head) {

        if(head == null || head.getNext() == null)
         return head;
        Node fast=head,slow=head;
        while(fast != null && fast.getNext() != null){
            fast = fast.getNext().getNext();
            slow = slow.getNext();
        }
        Node firstHalfHead = head, secondHalfHead = slow.getNext();
        slow.setNext(null); //Split the list in to two half;
        secondHalfHead = reverseList(secondHalfHead);

        Node firstHalfIter = firstHalfHead;
        Node secondHalfIter = secondHalfHead;

        while(secondHalfIter != null) {
            Node tmp = secondHalfIter.getNext();
            secondHalfIter.setNext(firstHalfIter.getNext());
            firstHalfIter.setNext(secondHalfIter);
            firstHalfIter = firstHalfIter.getNext().getNext();
            secondHalfIter = tmp;
        }

        return head;
    }

    private static Node reverseList(Node node) {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.getNext();
            current.setNext(prev);
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }

}
