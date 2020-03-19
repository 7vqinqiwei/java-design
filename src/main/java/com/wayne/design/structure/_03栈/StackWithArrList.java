package com.wayne.design.structure._03栈;

import com.wayne.design.structure._01数组.ArrayList;

/**
 * 栈只能操作一段的数据结构：使用上述学过的数组可以实现功能
 * @author
 */
public class StackWithArrList<E> {

    private ArrayList<E> list = new ArrayList<>();

    public int size(){
        return list.size();
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public void clear(){
        list.clear();
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
