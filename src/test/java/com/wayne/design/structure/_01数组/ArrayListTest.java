package com.wayne.design.structure._01数组;

import org.junit.Test;


public class ArrayListTest {


    @Test
    public void add() {

        ArrayList list = new ArrayList();
        for (int i = 1; i <= 50; i++) {
            list.add(i);
        }
        assert 50 == list.size;

        list.add(0,0);

        assert 0 == (Integer) list.get(0);

        assert 25 == (Integer) list.remove(25);

        assert 50 == list.size;
        System.out.println(list);


    }
}
