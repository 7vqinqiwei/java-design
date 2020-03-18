package com.wayne.design.structure._02链表;

import com.wayne.design.structure._01数组.AbstractList;
import com.wayne.design.structure._01数组.List;

/**
 * 单向链表
 *
 * @author
 */
public class SingleLinkedList<E> extends AbstractList<E> {

    private Node<E> first;

    @Override
    public void add(int index, E element) {
        rangeCheckForAdd(index);
        if (index == 0) {
            Node<E> newNode = new Node<>(element, first);
            first = newNode;
        } else {
            Node<E> prev = node(index - 1);
            Node<E> newNode = new Node<>(element, prev.next);
            prev.next = newNode;
        }
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
        Node<E> deleteNode = first;
        if (index == 0) {
            first = first.next;
        } else {
            Node<E> prev = node(index - 1);
            deleteNode = prev.next;
            prev.next = deleteNode.next;
        }
        size--;
        return deleteNode.element;
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
        if (element == null) {
            Node<E> node = first;
            for (int i = 0; i < size; i++) {
                if (node.element == null) {
                    return i;
                }
                node = node.next;
            }
        } else {
            Node<E> node = first;
            for (int i = 0; i < size; i++) {
                if (node.element.equals(element)) {
                    return i;
                }
                node = node.next;
            }
        }
        return List.ELEMENT_NOT_FOUND;
    }

    private Node<E> node(int index) {
        rangeCheck(index);
        Node<E> node = first;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        Node<E> node = first;

        stringBuilder.append("size:").append(size).append(",[");

        for (int i = 0; i < size; i++) {
            if (i != 0) {
                stringBuilder.append(",");
            }
            stringBuilder.append(node.element);
            node = node.next;
        }

        stringBuilder.append("]");

        return stringBuilder.toString();
    }

    class Node<E> {
        E element;
        Node<E> next;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }

    }
}
