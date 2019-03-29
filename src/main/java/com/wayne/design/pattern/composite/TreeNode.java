package com.wayne.design.pattern.composite;

import lombok.Getter;
import lombok.Setter;

import java.util.Vector;

/**
 * @Author: waynechin
 * @Date: 2019/3/29 12:02
 */
public class TreeNode {

    private @Setter @Getter String name;

    private @Setter @Getter TreeNode parent;

    private @Getter Vector<TreeNode> childrens = new Vector<>();

    public TreeNode(){}

    public TreeNode(String name) {
        this.name = name;
    }

    //增加子节点
    public void add(TreeNode node){
        childrens.add(node);
    }
    //删除子节点
    public void remove(TreeNode node){
        childrens.remove(node);
    }


}
