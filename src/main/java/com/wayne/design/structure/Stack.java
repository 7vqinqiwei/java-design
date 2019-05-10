package com.wayne.design.structure;

/**
 * 栈的数据结构
 * @author
 */
public class Stack {

    Node top;

    /**
     * 弹栈
     * @return
     */
    public Node pop(){
        if(top == null){
            return null;
        }else{
            Node temp = new Node(top.val);
            top = top.next;
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
        }
    }

}
