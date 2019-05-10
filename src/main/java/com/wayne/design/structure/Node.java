package com.wayne.design.structure;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author
 */
@ToString
@Getter
@Setter
public class Node {

    Object val;

    Node next;

    public Node(Object val){
        this.val = val;
        next = null;
    }

}
