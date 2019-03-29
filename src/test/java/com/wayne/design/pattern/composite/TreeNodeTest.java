package com.wayne.design.pattern.composite;

import org.junit.Test;

/**
 * @Author: waynechin
 * @Date: 2019/3/29 12:06
 */
public class TreeNodeTest {

    @Test
    public void method(){
        TreeNode root = new TreeNode("0");

        TreeNode node1 = new TreeNode("1");

        TreeNode node2 = new TreeNode("2");

        TreeNode node3 = new TreeNode("3");

        TreeNode node4 = new TreeNode("4");

        root.add(node1);
        root.add(node2);

        node1.add(node3);
        node2.add(node4);




    }

}