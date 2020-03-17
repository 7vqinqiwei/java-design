/**
 * 学习数据结构的内容
 *
 *                              动态数组                     链表
 *  *                           最好 最坏 平均        最好 最坏 平均
 *  * add(int index, E element) O(1) O(n) O(n)      O(1) O(n) O(n)
 *  * remove(int index)         O(1) O(n) O(n)      O(1) O(n) O(n)
 *  * set(int index, E element) O(1) O(1) O(1)      O(1) O(n) O(n)
 *  * get(int index)            O(1) O(1) O(1)      O(1) O(n) O(n)
 *
 *  双向链表 vs 动态数组
 * ◼ 如果有频繁的查询操作（随机访问操作），建议选择使用动态数组
 * ◼ 如果频繁在尾部进行添加、删除操作，动态数组、双向链表均可选择
 * ◼ 如果频繁在头部进行添加、删除操作，建议选择使用双向链表
 * ◼ 如果有频繁的（在任意位置）添加、删除操作，建议选择使用双向链表
 *
 */
package com.wayne.design.structure._01数组;
