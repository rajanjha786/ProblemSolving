package org.epi.list;

public class Node {

    private final int data;
    private  Node next;

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public static Node getNode(int data, Node nextPointer) {
        return new Node(data,nextPointer);
    }

    public int getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
       StringBuilder builder = new StringBuilder();
       Node tmpNextPointer = this;
       while(tmpNextPointer != null){
           builder.append(tmpNextPointer.data);
           tmpNextPointer = tmpNextPointer.next;
       }
       return builder.toString();
    }
}
