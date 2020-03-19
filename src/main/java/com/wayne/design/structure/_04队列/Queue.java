package com.wayne.design.structure._04队列;

/**
 * 队列
 * @author
 */
public class Queue {
    Node first,last;

    public class Node {
        Object val;
        Node next;
        public Node(Object val){
            this.val = val;
            next = null;
        }

    }
    /**
     * 进队
     * @param node
     */
    public void enqueue(Node node){
        if(first == null){
            first = node;
            last = first;
        }else {
            last.next = node;
            last = node;
        }
    }

    /**
     * 出队
     * @return
     */
    public Node dequeue(){
        if(first == null){
            return null;
        }else{
            Node temp = new Node(first.val);
            first = first.next;
            return temp;
        }
    }
}
