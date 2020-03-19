package com.wayne.design.structure._03栈;

import com.wayne.design.structure._02链表.LinkedList;

/**
 * 使用链表操作栈元素
 * @author
 * @param <E>
 */
public class StackWithLinkedList<E> {
    private LinkedList<E> list = new LinkedList<E>();

    public int size(){
        return list.size();
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    /**
     * 压栈
     * @param element
     */
    public void push(E element){
        list.add(element);
    }

    /**
     * 弹栈
     * @return
     */
    public E pop(){
        return list.remove(list.size() -1);
    }

    /**
     * 获取栈顶元素
     * @return
     */
    public E top(){
        return list.get(list.size()-1);
    }


}
