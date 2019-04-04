package com.wayne.design.pattern.state;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class State {

    private Integer value;

    public void method1(){
        System.out.println("execute the first opt!");
    }

    public void method2(){
        System.out.println("execute the second opt!");
    }

}
