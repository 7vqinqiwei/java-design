package com.wayne.design.structure;

import com.wayne.design.structure._04队列.Queue;
import org.junit.Test;

public class QueueTest {

    @Test
    public void test() {
        Queue queue = new Queue();
        for (int i = 0; i < 10; i++) {
            Queue.Node node = new Queue.Node(i);
            queue.enqueue(node);
        }
    }
}
