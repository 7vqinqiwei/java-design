package com.wayne.design.pattern.state;

import lombok.Getter;
import lombok.Setter;

public class Context {

    @Setter
    @Getter
    private State state;

    public Context(State state){
        this.state = state;
    }

    /**
     * 根据自身状态影响其行为
     */
    public void method(){
        if(state.getValue().equals(1)){
            state.method1();
        }else if(state.getValue().equals(2)){
            state.method2();
        }
    }



}
