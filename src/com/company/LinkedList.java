package com.company;

public class LinkedList {
    Node head;
    Node tail;

    public LinkedList() {
        head = null;
        tail = null;
    }


    public void add(int count, Object itemToAdd) {
        Node currentNode = head;
        Node newNode = new Node(itemToAdd);
        int counter = 0;
        if (head == null) {
            head = newNode;

        } else {
            while (currentNode.next != null & counter < count - 1) {
                counter++;
                currentNode = currentNode.next;
            }
            Node extra = new Node(itemToAdd);
            extra.next = currentNode.next;
            currentNode.next = extra;
        }
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
            return currentNode;
        }
    }


    public void clear() {
        Node newNode = new Node(0);
        head = newNode;
    }


    public void addFirst(Object itemToAdd) {
        Node First = new Node(itemToAdd);
        First.next = head;
        head = First;
    }

    public boolean contains(Object item) {
        Node first = head;
        if (first != null && first.data == item) {
            head = first.next;
            return true;
        }
        while (first != null && first.data != item) {
            first = first.next;

        }
        if (first == null) {
            return false;
        }
        return true;
    }

    public void addLast(Object item) {
        Node curr = head;
        if (curr != head) {
            curr = curr.next;
        }
        Node last = new Node(item);
        curr.next = last;

    }

    public Object get(int index) {
        Node first = head;
        int counter = 0;
        while (first.next != null & counter < index) {
            counter++;
            first = first.next;
        }
        return first.data;
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


    public Object getFirst() {
        Node first = head;
        return first.data;
    }

    public int lastIndexOf(Object item) {
        Node first = head;

        int county = 0;
        if (first != null && first.data == item) {
            head = first.next;
        }
        while (first != null && first.data != item) {

            first = first.next;
            county++;

        }
        if (first == null) {
        }

        first.next = first.next;
        return county;

    }


    public Object getLast() {
        Node first = head;
        while (first.next != null) {
            first = first.next;
        }
        return first.data; //last is returned
    }

    public int indexOf(Object item) {
        Node first = head;

        int count = 0;
        if (first != null && first.data == item) {
            head = first.next;
        }
        while (first != null && first.data != item) {
            first = first.next;
            count++;

        }
        if (first == null) {
        }

        return count;

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

    public Object poll() {
        Node first = head;
        head = first.next;
        return first.data;
    }

    public Object pollLast() {
        Node first = head; // first node
        while (first.next != null) {
            first = first.next;
        }
        Node last = first.next;
        last.next = null;
        return last.data;
    }


    public Object remove(int value) {
        Node first = head;
        Node prev = null;
        int currentIndex = 0;

        while (first.next != null) {
            first = first.next;
            currentIndex++;
            if (currentIndex == (value)) {
                head = first.next;
            else if {
                    prev.next = first.next;
                }
            }
            return first;
        }
    }



    public Object remove(Object obj){
        Node first = head;
        Node night = null;

        if(first != null && first.data == obj){
            head = first.next;
            return first.data;
        }
        while(first != null && first.data != obj){
            night = first;
            first = first.next;

        }
        if (first == null){
            return obj;
        }

        night.next = first.next;
        return first.data;

    }



    public void display(){
        Node first = head;
        if(head == null){

        }
        else if (first.next != null) {
            while (first.next != null) {
                System.out.println(first.data);
                first = first.next;
            }
            System.out.println(first.data);
        }
    }














}
































































