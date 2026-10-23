package linkedList;

public class MyLinkedList {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    private Node head;
    private int size;

    public MyLinkedList() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size(){
        return size;
    }

    public int get(int position) {
        if (position < 0 || position >= size) {
            throw new IndexOutOfBoundsException("Invalid index: " + position);
        }
        Node current = head;
        for (int count = 0; count < position; count++) {
            current = current.next;
        }
        return current.data;
    }


    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        }else{
            Node current = head;
            while (current.next != null){
                current = current.next;
            }
            current.next = newNode;

        }
        size++;
    }

    public void prepend(int data) {
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }else {
            Node current = head;
            head = newNode;
            newNode = current;
        }
        size++;
    }
    public void insertAt(int data, int position) {
        if (position == 0){
            prepend(data);
            return;
        }
        Node newNode = new Node(data);
        Node current = head;
        for(int count = 0; count < position; count++) {
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
        size++;

    }

    public void RemoveAt(int position) {
        if (position == 0) {
            head = head.next;
        } else {
            Node current = head;
            for (int count = 0; count < position - 1; count++) {
                current = current.next;
            }
            current.next = current.next.next;
        }
        size--;
    }

}


