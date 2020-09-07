package com.wayne.design.structure._03栈;

import com.wayne.design.structure._01数组.ArrayList;

/**
 * @author
 * 使用动态数组实现栈
 */
public class StackWithArrayList<E> {

    private ArrayList<E> list = new ArrayList<>();

    public void clear(){
        list.clear();
    }

    public int size(){
        return list.size();
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public void push(E element){
        list.add(element);
    }

    public E pop(){
        return list.remove(list.size()-1);
    }


    public E peek(){
        return list.get(list.size() -1);
    }
}
