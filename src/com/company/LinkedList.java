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
            return currentNode;
        }
    }

    public void clear(){
        head.setNext(null);
    }


    public void addFirst(Object item){
        head.setData(item);
    }

    public void addLast(Object item){
        Node curr = head;
        if ( curr != head){
            curr = curr.next;
        }else if( curr == null) {
            curr.setData(item);
        }
        }


    public boolean contains(Object item) {
   Node curr = head;
   boolean tilt;
   while ( curr != null){
       curr = curr.next;
       if ( curr == item){
           tilt = true;
           else if ( curr != item){
               tilt = false;
           }
       }

   }

        return tilt;

    }


    public Object get(int index){
        int i = 0;
        Node curr = head;
        Object empty;
        while ( curr != null){
            i++;
            if ( i == index){
               empty = curr;
            }
        }
        return empty;
    }

    public Object getFirst(){
       Object data = head.getData();
        return data;
    }

    public Object getLast(){
        Object data = tail.getData();
        return tail;
    }

    public int indexOf(Object item){
        int i = 0;
        Node curr = head;
        while ( curr.getData() != item){
            curr = curr.next;
            i++;
        }
        return i;
    }

    /*
    public int lastIndexOf(Object item){ //help^^
       int i = 0;
       Node curr = head;


    }
*/
    public Object poll(){ //help

    }

        Object pollLast(){ //help

}









        public Object remove(Object data){
            Node previous = head;
            Node current = head.getNext();
            while (current != null) {
                Object dataOld = current.getData();
                if ((dataOld == null && data == null) || (dataOld != null && dataOld == (data))) {
                    Node afterRemoved = current.getNext();
                    previous.setNext(afterRemoved);
                    if (afterRemoved == null) { // removing last element
                        last = previous;
                    }
                    size--;

                } else {
                    previous = current;
                    current = current.getNext();
                }
            }

        }



    public boolean remove(int value) {
        Node current = head;
        Node previous = null;
        int currentIndex = 0;

        while (current.next != null) {
            current = current.next;
            currentIndex++;
            if (currentIndex == (value)) {
                head = current.next;
            else if{
                    previous.next = current.next;
                }
            }
            return current;
        }

        public Object poll(){
            Node first = head;
            if(first != null){

            }


        }


















    public void add(int i, Object item) {
        // adds an item at the given index of the the list.
        System.out.println("The current Linked List is Empty");
        Node newNode = new Node(newEntry);
        head = newNode;
        System.out.println("New node added");
    }
     else{
        System.out.println("Existing Linked List is found.");


        while (currentNode.next != null) {
            System.out.println("Current node is pointing to another node");
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
        System.out.println("New node added");




    }











    }






























































