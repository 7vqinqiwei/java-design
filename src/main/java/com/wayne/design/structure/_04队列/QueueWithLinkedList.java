package com.wayne.design.structure._04队列;

import com.wayne.design.structure._02链表.LinkedList;

/**
 * 队列是两端操作的
 * 一般是一端出一段进 -- 是正向队列 FIFO
 * @author
 */
public class QueueWithLinkedList<E> {

    private LinkedList<E> list = new LinkedList<>();

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void clear() {
        list.clear();
    }

    public void enQueue(E element) {
        list.add(element);
    }

    public E deQueue() {
        return list.remove(0);
    }

    public E front() {
        return list.get(0);
    }

}
