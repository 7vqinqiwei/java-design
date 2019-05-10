package com.wayne.design.structure;

import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {

    @Test
    public void test() {
        Queue queue = new Queue();
        for (int i = 0; i < 10; i++) {
            Node node = new Node(i);
            queue.enqueue(node);
        }
        while (queue.first != null){
            System.out.println(queue.dequeue());
        }
    }
}