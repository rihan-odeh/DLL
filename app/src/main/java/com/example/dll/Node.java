package com.example.dll;

public class Node {
     Node next;
     Node previous;
    private int value;

    public Node(int value) {
        this.value = value;
        this.next = null;
        this.previous = null;
    }
    public void setValue(int value) {
        this.value = value;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getNext() {
        return next;
    }

    public int getValue() {
        return value;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    @Override
    public String toString() {
        return "Node{" +

                ", value=" + value +
                '}';
    }
}
