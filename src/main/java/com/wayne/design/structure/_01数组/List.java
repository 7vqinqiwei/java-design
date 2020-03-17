package com.wayne.design.structure._01数组;

/**
 * 数组的抽象方法
 * 数组中属性有 size以及元素
 * 数组中方法有 CRUD的操作
 * @author
 */
public interface List<E> {

    static final int ELEMENT_NOT_FOUND = -1;

    /**
     * 元素的数量
     * @return
     */
    int size();

    /**
     * 是否为空
     * @return
     */
    boolean isEmpty();

    /**
     * 添加元素到尾部
     * @param element
     */
    void add(E element);

    /**
     * 在index位置插入一个元素
     * @param index
     * @param element
     */
    void add(int index, E element);

    /**
     * 清除所有元素
     */
    void clear();

    /**
     * 删除index位置的元素
     * @param index
     * @return
     */
    E remove(int index);


    /**
     * 获取index位置的元素
     * @param index
     * @return
     */
    E get(int index);

    /**
     * 是否包含某个元素
     * @param element
     * @return
     */
    boolean contains(E element);

    /**
     * 设置index位置的元素
     * @param index
     * @param element
     * @return 原来的元素ֵ
     */
    E set(int index, E element);


    /**
     * 查看元素的索引
     * @param element
     * @return
     */
    int indexOf(E element);

}
