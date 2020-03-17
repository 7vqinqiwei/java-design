package com.wayne.design.structure._02链表;

import com.wayne.design.structure._01数组.AbstractList;
import com.wayne.design.structure._01数组.List;

/**
 * 在SingleLinkedList 基础之上增加一个虚拟头节点
 * @author DELL
 */
public class SingleLinkedWithHeadList<E> extends AbstractList<E> {

    private Node<E> first;

    /**
     * 默认初始化虚拟头节点
     */
    public SingleLinkedWithHeadList(){
        first = new Node<>(null,null);
    }

    class Node<E> {
        E element;
        Node<E> next;
        public Node(E element,Node<E> next){
            this.element = element;
            this.next = next;
        }

    }

    @Override
    public void add(int index, E element) {
        rangeCheckForAdd(index);

        //TODO
        Node<E> prev = index == 0? first : node(index-1);
        prev.next = new Node<>(element,prev.next);

        size++;
    }

    @Override
    public void clear() {
        size = 0;
        first = null;
    }

    @Override
    public E remove(int index) {
        rangeCheck(index);
        Node<E> node = first;
        //TODO
        Node<E> prev = index == 0? first : node(index-1);
        node = prev.next;
        prev.next = node.next;

        size --;
        return node.element;
    }

    @Override
    public E get(int index) {
        return node(index).element;
    }

    @Override
    public E set(int index, E element) {
        Node<E> node = node(index);
        E oldElement = node.element;
        node.element = element;
        return oldElement;
    }

    @Override
    public int indexOf(E element) {
        //TODO
        Node<E> node = first.next;
        if (element == null){
            for (int i = 0; i < size; i++) {
                if (node.element == null){
                    return i;
                }
                node = node.next;
            }
        }else{
            for (int i = 0; i < size; i++) {
                if (node.element.equals(element)){
                    return i;
                }
                node = node.next;
            }
        }
        return List.ELEMENT_NOT_FOUND;
    }

    private Node<E> node(int index){
        rangeCheck(index);
        //TODO
        Node<E> node = first.next;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        //TODO
        Node<E> node = first.next;

        stringBuilder.append("size:").append(size).append(",[");

        for (int i = 0; i < size; i++) {
            if (i != 0){
                stringBuilder.append(",");
            }
            stringBuilder.append(node.element);
            node = node.next;
        }

        stringBuilder.append("]");

        return stringBuilder.toString();
    }
}
