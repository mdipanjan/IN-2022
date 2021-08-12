package com.mdipanjan;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    LinkedList list = new LinkedList();
	    list.append(10);
        list.append(20);
        list.append(30);
        list.append(40);
        list.append(50);
//        list.prepend(45);
//        list.removeFirst();
//        list.removeLast();
//        System.out.println(Arrays.toString(list.toArray(6)));
//        System.out.println(list.findMiddleNode());
        list.reverser();
        System.out.println(Arrays.toString(list.toArray(5)));
    }
}
