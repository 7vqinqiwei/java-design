package com.wayne.design.structure._03栈;

/**
 * 使用单向链表的方式 一直往添加头部元素
 * @author
 */
public class Stack {

    private int size;

    Node top;

    public void clear(){
        size = 0;
        top = null;
    }

    public class Node {
        Object val;
        Node next;
        public Node(Object val){
            this.val = val;
            next = null;
        }
    }


    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    /**
     * 弹栈
     * @return
     */
    public Node pop(){
        if(top == null){
            //size = 0;
            return null;
        }else{
            Node temp = new Node(top.val);
            top = top.next;
            size--;
            return temp;
        }
    }

    /**
     * 压栈
     * @param n
     */
    public void push(Node n){
        if(n != null){
            n.next = top;
            top = n;
            size ++;
        }
    }

}
