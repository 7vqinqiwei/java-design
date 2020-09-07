package com.wayne.design.structure._02链表;

import com.wayne.design.structure._01数组.AbstractList;
import com.wayne.design.structure._01数组.List;

/**
 * 双向链表的实现 JDK 官方使用的方式
 * @author
 */
public class CircleLinkedList<E> extends AbstractList<E> {

    private Node<E> first;

    private Node<E> last;

    class Node<E> {
        E element;
        Node<E> prev;
        Node<E> next;
        public Node(Node<E> prev,E element,Node<E> next){
            this.prev = prev;
            this.element = element;
            this.next = next;
        }

    }

    @Override
    public void add(int index, E element) {
        rangeCheckForAdd(index);
        // size == 0
        // index == 0
        if (index == size) { // 往最后面添加元素
            Node<E> oldLast = last;
            last = new Node<>(oldLast, element, first);
            if (oldLast == null) { // 这是链表添加的第一个元素
                first = last;
                first.next = first;
                first.prev = first;
            } else {
                oldLast.next = last;
                first.prev = last;
            }
        } else {
            Node<E> next = node(index);
            Node<E> prev = next.prev;
            Node<E> node = new Node<>(prev, element, next);
            next.prev = node;
            prev.next = node;

            if (next == first) { // index == 0
                first = node;
            }
        }

        size++;
        size++;
    }

    @Override
    public void clear() {
        size = 0;
        first = null;
        last = null;
    }

    @Override
    public E remove(int index) {
        rangeCheck(index);
        return remove(node(index));
    }

    private E remove(Node<E> node) {
        if (size == 1) {
            first = null;
            last = null;
        } else {
            Node<E> prev = node.prev;
            Node<E> next = node.next;
            prev.next = next;
            next.prev = prev;

            if (node == first) { // index == 0
                first = next;
            }

            if (node == last) { // index == size - 1
                last = prev;
            }
        }

        size--;
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
        if (element == null){
            Node<E> node = first;
            for (int i = 0; i < size; i++) {
                if (node.element == null){
                    return i;
                }
                node = node.next;
            }
        }else{
            Node<E> node = first;
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
        if (index < (size >> 1)) {
            Node<E> node = first;
            for (int i = 0; i < index; i++) {
                node = node.next;
            }
            return node;
        } else {
            Node<E> node = last;
            for (int i = size - 1; i > index; i--) {
                node = node.prev;
            }
            return node;
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        Node<E> node = first;

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
