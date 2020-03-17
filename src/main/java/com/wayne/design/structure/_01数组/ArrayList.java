package com.wayne.design.structure._01数组;

/**
 *
 * 接口设计：
 * ◼ int size(); // 元素的数量
 * ◼ boolean isEmpty(); // 是否为空
 * ◼ boolean contains(E element); // 是否包含某个元素
 * ◼ void add(E element); // 添加元素到最后面
 * ◼ E get(int index); // 返回index位置对应的元素
 * ◼ E set(int index, E element); // 设置index位置的元素
 * ◼ void add(int index, E element); // 往index位置添加元素
 * ◼ E remove(int index); // 删除index位置对应的元素
 * ◼ int indexOf(E element); // 查看元素的位置
 * ◼ void clear(); // 清除所有元素
 *
 * 动态数组实现对应于java.util.ArrayList源码分析
 * 核心是添加的时候如何动态扩容
 * -- 拓展 ： 删除的时候如何缩容
 *
 *
 * @author
 */
public class ArrayList<E> extends AbstractList<E>{

    private static int DEFAULT_CAPACITY = 10;

    /**
     * 数组的元素
     */
    private E[] elements;

    public ArrayList(int capacity){
        if (capacity < DEFAULT_CAPACITY){
            capacity = DEFAULT_CAPACITY;
        }
        elements = (E[]) new Object[capacity];
    }

    public ArrayList(){
        this(DEFAULT_CAPACITY);
    }

    @Override
    public void add(int index,E element){
        rangeCheckForAdd(index);
        //保证数组长度是否可用
        ensureCapacity(size+1);

        for (int i = size; i > index; i--) {
            elements[i] = elements[i-1];
        }
        elements[index] = element;
        size++;
    }

    /**
     * 扩容保证元素有地方可用
     * @param capacity
     */
    private void ensureCapacity(int capacity) {

        int oldCapacity = elements.length;

        if (oldCapacity < capacity){
            int newCapacity = oldCapacity + (oldCapacity >> 1);
            E[] newElements  = (E[]) new Object[newCapacity];
            for (int i = 0; i < size; i++) {
                newElements[i] = elements[i];
            }
            elements = newElements;
        }


    }

    @Override
    public E remove(int index){
        rangeCheck(index);
        E oldElement = (E) elements[index];
        for (int i = index; i < size; i++) {
            elements[i] = elements[i+1];
        }
        elements[--size] = null;

//        trim();

        return oldElement;
    }

    /**
     * 缩容问题
     * 防止扩容和缩容的时候复杂度震荡问题：即新增为11的时候扩容，删除11的时候缩容
     * 避免的方案是扩容因数*缩容因素 ！= 1
     */
    private void trim() {
        int oldCapacity = elements.length;
        int newCapacity = oldCapacity>>1;
        if (size > (newCapacity) || oldCapacity <= DEFAULT_CAPACITY) {
            return;
        }
        E[] newElement = (E[]) new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            newElement[i] = elements[i];
        }
        elements = newElement;
        System.out.println("缩容后大小：" + newCapacity);
    }

    @Override
    public void clear(){
        size = 0;
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        //非必要，但需要思考内存使用 缩容
//        if (elements != null && elements.length > DEFAULT_CAPACITY) {
//            elements = (E[]) new Object[DEFAULT_CAPACITY];
//        }

    }

    @Override
    public E set(int index,E element){
        rangeCheck(index);
        E oldElement = elements[index];
        elements[index] = element;
        return oldElement;
    }

    @Override
    public E get(int index){
        rangeCheck(index);
        return elements[index];
    }

    /**
     * 给出元素的下标
     * @param element
     * @return
     */
    @Override
    public int indexOf(E element){
        if (element == null){
            for (int i = 0; i < size; i++) {
                if (elements[i] == null){
                    return i;
                }
            }
        }else{
            for (int i = 0; i < size; i++) {
                if (element.equals(elements[i])){
                    return i;
                }
            }
        }
        return -1;
    }

    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("size:").append(size).append(",[");
        for (int i = 0; i < size; i++) {
            if (i != 0){
                stringBuilder.append(",");
            }
            stringBuilder.append(elements[i]);
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }



}
