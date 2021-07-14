package com.example.dll;

public class DoublyLinkedList {
    Node head;
    int size;
    String string;


    public DoublyLinkedList(int number){
        head= new Node(number);
        size =1;
        string ="";

    }
    public void addNode(int value){
        Node newNode =new Node(value);
        Node current = head;
        if(head.equals(null)){
            head = newNode;
        }
        while(current.next !=null){
            current= current.next;
        }
        current.next = newNode;
        newNode.previous = current;
        size++;
    }
    public void printValuesBackward(){
        string ="";
        Node current = head;
        while(current.next !=null){
            current= current.next;
        }
        while(current !=null){
            string += "\t " +current.getValue();

            current= current.previous;
        }

    }

    public String getString() {
        return string;
    }
    public Node pop(){
        Node node;
        Node current = head.next;
        Node previous = current.previous;
        while(current.next !=null){
            current= current.next;
            previous= previous.next;
        }
        node = current;
        current= null;
        previous.next=null;
        size--;

        return node;
    }
    public boolean contains(int value){
        Node current = head;
        while(current.next !=null){
            if(current.getValue()==value){
                return true;
            }
            current= current.next;
        }

    return false; }
    public int size(){
        return size;
    }
}
