package com.company;

public class LinkedList{
    Node head;
    public LinkedList(){
        head = null;
    }



    /*

    [] -> [] -> [] -> [] -> NULL


     */


    public void add(Object newEntry) {
        Node currentNode = head;
        Node newNode = new Node(newEntry);
        if (head == null) {
            head = newNode;
        }
        else
        {
            while(currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }

    }

    public void addFirst(Object newEntry){
        Node oldRoot = head;
        Node newNode = new Node(newEntry);
        if(head == null){
            head = newNode;
        }
        else{
            head = newNode;
            newNode.next = oldRoot;
        }
    }

    boolean addLast(Object newEntry){
        add(newEntry);
        return true;
    }
    public Object getFirst(){
        if (head == null) {
            return null;
        }
        else {
            return head;
        }
    }

    public Object getLast(){
        Node currentNode = head;
        if(head == null) {
            return null;
        }
        else {
            while(currentNode.next != null) {
                currentNode = currentNode.next;
            }
            return currentNode.data;
        }
    }

    public int size(){
        Node currentNode = head;
        int count = 0;
        if(head == null){
            return 0;
        }
        while(currentNode.next != null){
            currentNode = currentNode.next;
            count++;
        }
        return count + 1;
    }
    public void display(){
        Node currentNode = head;
        while(currentNode.next != null) {
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
        System.out.println(currentNode.data);
    }

    public class Node{
        Object data;
        Node next;
        Node previous;

        public Node(Object data){
            this.data = data;
            next = null;

             /*

    [] -> [] -> [] -> [] -> NULL


     */

        }

        public Object getData() {
            return data;
        }

        public void setData(Object data) {
            this.data = data;
        }


    }

}