package com.wayne.design.pattern.iterator;

import org.junit.Test;

public class MyIteratorTest {

    @Test
    public void method() {
        Collection collection = new MyCollection();
        Iterator it = collection.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}