package com.company;

public class LinkedList {
    Node head;
    Node tail;

    public LinkedList() {
        head = null;
        tail = null;
    }


    public boolean add(Object newEntry) {
        Node currentNode = head;
        Node newNode = new Node(newEntry);


        if (head == null) {
            System.out.println("The current Linked List is Empty");
            Node newNode = new Node(newEntry);
            head = newNode;
            System.out.println("New node added");
        } else {
            System.out.println("Existing Linked List is found.");
            while (currentNode.next != null) {
                System.out.println("Current node is pointing to another node");
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
            System.out.println("New node added");
        }
        return true;
    }



   public int size() {
       Node first = head;
       int count = 0;
       while (first != null) {
           count++;
           first = first.next;
       }
       return count;
   }

    public Object set(int index, Object item) {
        int i = index;
        Node currentNode = head;
        int currentIndex = 0;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
            currentIndex++;
            if (currentIndex == i) { //return object removed
                currentNode.setData(item);
            }
            return LinkedList;
        }
    }

        public Object remove(Object data){
            Node previous = head;
            Node current = head.getNext();
            while (current != null) {
                Object dataOld = current.getData();
                if ((dataOld == null && data == null) || (dataOld != null && dataOld.equals(data))) {
                    Node afterRemoved = current.getNext();
                    previous.setNext(afterRemoved);
                    if (afterRemoved == null) { // removing last element
                        last = previous;
                    }
                    size--;
                    return true;
                } else {
                    previous = current;
                    current = current.getNext();
                }
            }
            return false;
        }















    public void add(int i, Object item) {
        // adds an item at the given index of the the list.
        System.out.println("The current Linked List is Empty");
        Node newNode = new Node(newEntry);
        head = newNode;
        System.out.println("New node added");
    }
     else

    {
        System.out.println("Existing Linked List is found.");


        while (currentNode.next != null) {
            System.out.println("Current node is pointing to another node");
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
        System.out.println("New node added");




    }











    }









































    }




















