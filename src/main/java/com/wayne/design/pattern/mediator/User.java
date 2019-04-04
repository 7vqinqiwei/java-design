package com.wayne.design.pattern.mediator;

import lombok.Getter;
import lombok.Setter;

public abstract class User {

    @Setter
    @Getter
    private String name;

    @Getter
    private Mediator mediator;

    public User(Mediator mediator){
        this.mediator = mediator;
    }

    public abstract void chat(User from,String msg);



}
