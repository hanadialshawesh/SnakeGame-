package org.example;

import java.util.Random;

public class CircularLinkedList<E>{


    // Create Node Class
    public class Node<U> {
        public U data;
        public Node<U> next;

        public Node(U data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node<E> tail;        // There is no head since tail is connected back to head
    public int size = 0;

    public CircularLinkedList() {

        this.tail = null;
    }

    public int size() {

        return this.size;       // return the size of the LinkedList
    }

    public boolean isEmpty() {

        return this.size == 0;      // return true if size is 0 (LinkedList is empty)
    }

    public int rollDice() {

        int n = 0;
        Random rand = new Random();
        n = rand.nextInt(6) + 1;
        if (n == 6) {
            n += rand.nextInt(6) + 1;
            
        }
        if (n == 12) {
            n += rand.nextInt(6) + 1;
        }
        if (n == 18) {
            return 0;
        }
        
        return n;
    }

    public E first() { // the last num you enter 1 2 3 4 5 6 "6" you enter <--
        if (isEmpty())
            return null;    // return null if LinkedList is empty

        return this.tail.next.data;     // return the value of tail.next (first node)
    }

    public E getLast() { // the first num you enter 1 2 3 4 5 6 "1" you enter <--
        if (isEmpty())
            return null;

        return this.tail.data;
    }
//     public E first(){            // returns (but doesn't remove) the first element
//         if(isEmpty())
//             return null;
        
//         return (E)tail.getnext().getElement();    // the haed is after the tail
//         
//     }

    public void rotate() {  //2 3 4 5 1
        if (!isEmpty())
            this.tail = this.tail.next;
        this.size++;
    }

    public void addFirst(E data) {
        if (this.size == 0) {
            this.tail = new Node<E>(data);
            this.tail.next = this.tail;
            this.size++;
        } else {
            Node<E> node = new Node<E>(data);
            node.next = this.tail.next;
            this.tail.next = node;
            this.size++;
        }


    }

    public void addLast(E data) {
        addFirst(data);
        this.tail = this.tail.next;
        this.size++;
    }

    public E removeFirst() {
        if (isEmpty())
            return null;

        Node<E> head = this.tail.next;

        if (head == this.tail)
            this.tail = null;
        else
            this.tail.next = head.next;     // Ignoring head node, directly connecting tail to next node of head
        this.size--;

        return head.data;       // return the value of the node removed
    }

    public E removeLast() {
        if (isEmpty())
            return null;

        Node<E> head = this.tail;

        if (head == this.tail)
            this.tail = null;
        else
            this.tail.next = head.next;     // Ignoring head node, directly connecting tail to next node of head
        this.size--;

        return head.data;       // return the value of the node removed
    }

    //     public E FindMax() {
    //     if (this.tail.next == null)
    //         return null;

    //     Node<E> current = this.tail.next;
    //     E max = current.data;

    //     do {
    //         if (current.data.compareTo(max) > 0)
    //             max = current.data;
    //         current = current.next;
    //     } while (current != this.tail.next);

    //     return max;
    // }


    public void printLinkedList() {
        Node<E> current = this.tail.next;

       if (this.tail != null) {
            do {
                System.out.print(current.data + " ");
                current = current.next;
            } while (current != this.tail.next);

            System.out.print("\n");
       }
    }

    public void splitprint() {   //1 2 3
                                 //4 5 6
        Node<E> current = this.tail.next;
        int T = this.size / 2;
        int i = 1;

        do {
            System.out.print(current.data + " ");
            current = current.next;
            i++;
           } 
        while (current != this.tail.next && i <= T);
        System.out.print("\n");

        do {
        System.out.print(current.data + " ");
        current = current.next;
        T++;
         } 
        while (current != this.tail.next && T <= this.size);

        System.out.print("\n");
    }



}
