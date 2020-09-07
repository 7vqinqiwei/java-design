package com.wayne.design.structure._05二叉搜索树;

/**
 * @author
 * 二叉搜索树
 */
public class BinarySearchTree<E> {

    private Node<E> root;

    private int size;

    public int size(){
        return size;
    }

    public void add(E element){

        if (element == null){
            throw new NullPointerException("存储元素不能为空");
        }

        if (null == root){
            root = new Node<>(element,null);
            size++;
            return;
        }else{

            Node<E> parent = root;
            
            int cmp = compare(root,element);

            if (cmp > 0){

            }else if(cmp < 0){

            }else{

            }

            Node<E> newNode = new Node<>(element,parent);
            size ++;
        }

    }

    public void clear(){
        size = 0;
        root = null;
    }

    public boolean isEmpty(){
        return size == 0;
    }
    private static class Node<E>{
        private E element;
        private Node<E> parent;
        private Node<E> left;
        private Node<E> right;
        public Node(E element,Node<E> parent){
            this.element = element;
            this.parent = parent;
        }
    }

}
