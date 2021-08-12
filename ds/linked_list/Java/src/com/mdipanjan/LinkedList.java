package com.mdipanjan;

public class LinkedList {
    public class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
        }
    }
    public Node head;
    public Node tail;
    public void append(int data){
        Node node = new Node(data);
        if(head == null){
            head = tail = node;
        }else {
            tail.next = node;
            tail = node;
        }
    }
    public void  prepend(int data){
        Node node = new Node(data);
        if(head == null){
            head = tail =  node;
        }else{
            node.next = head;
            head = node;
        }

    }
    public int indexOf(int data){
      int index = 0;
      Node current = head;
      while (current!= null){
          if(current.data == data){
              return index;
          }
          current = current.next;
          index ++;
      }
        return -1;
    }
    public void removeFirst(){
        if(head != null) {
            if(head == tail){
                head = tail = null;
            }
            Node second = head.next;
            head.next = null;
            head = second;
        }
    }
    public void removeLast(){
        Node current = head;
        while (current != null){
            if(current.next == tail){
                tail = current;
                tail.next = null;
            }
            current = current.next;
        }


    }
    // Problems
    //LinkedList -> Array
    public int [] toArray(int size){
        int [] array = new int[size];
        int index = 0;
        Node current = head;
        while (current != null){
            array[index] = current.data;
            index++;
            current = current.next;
        }
        return array;
    }
    //Reverse LinkedList
    public void reverser(){
       // [10 -> 20 -> 30]
        // pre   cur  nex
        // nex = cur.next
        // cur.next = pre

        Node prevNode = head;
        Node currentNode = head.next;

        while (currentNode != null){
            Node nextNode = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = nextNode;
        }
        tail = head;
        tail.next = null;
        head = prevNode;
    }
    //Find MiddleNode
    public int findMiddleNode() {
        Node current = head;
        Node current2 = head;
        int index = 0;
        int index2 = 0;
        Node middle = null;
        // Loop through and define if Even or Odd
        //If even Index = size / 2 + 1
        // Else Odd Index = size / 2 + 1
        while (current != null){
            index++;
            current = current.next;
        }
        while (current2 != null){
            index2++;
            current2 = current2.next;
            if(index2 == index/2){
                middle =  current2;
                System.out.println(middle.data);
            }
        }
        return middle.data;
    }
}
