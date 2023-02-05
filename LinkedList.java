package com.company;

class LinkedList{
    NODE head;
    NODE tail;

    public LinkedList(){
        head = null;
        tail = null;
    }

    public LinkedList(NODE head){
        this.head = head;
        this.tail = head;
    }

    public void append(String s){
        if (head == null){ // empty list
            this.head = new NODE(s);
            this.tail = this.head;
        }else if(head.next == null){ //list has one element
            this.tail = new NODE(s);
            this.head.next = tail;
        }else{ //If there are two or more nodes
            NODE n = new NODE(s);
            this.tail.next = n;
            this.tail = n;
        }
    }

    public void print(){
        NODE pointer = head;
        while (pointer != null){
            System.out.print(pointer.data);
            pointer = pointer.next;
        }
    }

    public void addFront(String s){
        if (head == null) { // empty list
            this.head = new NODE(s);
            this.tail = this.head;
        }
        NODE n = new NODE(s);
        n.next = this.head;
        this.head = n;

    }

    public String popFront(){
        NODE n = this.head;
        this.head = this.head.next;
        n.next = null;
        return n.data;
    }

    public String popBack(){
        NODE pointer = head;
        String d = this.tail.data;
        while (true){
            if (pointer.next == this.tail)
                break;
            pointer = pointer.next;
        }
        this.tail = pointer;
        pointer.next = null;

        return pointer.data;
    }

    public void remove(String s, LinkedList list){
        if (this.head.data.equals(s)){ //if the string is the head
            popFront();
        }
        if (this.tail.data.equals(s)){ //if the string is the tail
            popBack();
        }
        NODE pointer = head;
        String f;
        for (int i = 0; i<list.length; i++)
    }
}