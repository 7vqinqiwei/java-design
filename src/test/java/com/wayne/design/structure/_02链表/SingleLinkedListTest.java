package com.wayne.design.structure._02链表;

import org.junit.Test;


public class SingleLinkedListTest {


    @Test
    public void test() {
        SingleLinkedList<Integer> list = new SingleLinkedList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
        System.out.println(list.toString());
        list.add(3,40);
        System.out.println(list.toString());
        list.add(0,10);
        System.out.println(list.toString());
        list.remove(list.size()-1);
        System.out.println(list.toString());
        list.remove(7);
        System.out.println(list.toString());

    }
}
