package com.company;

public class LinkedList {
    Node head;
    Node tail;
    public LinkedList() {
        head = null;
        tail = null;
    }



    boolean void add(Object itemToAdd){
     if(head == null){
       Node newNode = new Node(itemToAdd);
       head = newNode;
     }
 else {
     Node currentNode = head;
     while(currentNode.next != null){
     }

     }

    }







    private class Node {
        Object data;
        Node next;
        Node previous;

        public Node(Object data) {
            this.data = data;
            next = null;

            /*
            [ ] -> [ ] -> [ ] -> [ ] -> NULL
             */
        }

        public Object getData() {
            return data;
        }

        public void setData(Object data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node getPrevious() {
            return previous;
        }

        public void setPrevious(Node previous) {
            this.previous = previous;
        }
