package com.company;

public class Main {

    public static void main(String[] args) {
        NODE n = new NODE("H");
        NODE n2 = new NODE("E");
        n.next = n2;
        //System.out.println(n.next.data);

        LinkedList list = new LinkedList();
        list.append("A");
        list.append("B");
        list.append("C");
        list.addFront("D");
        list.popFront();
        list.print();
    }
}
