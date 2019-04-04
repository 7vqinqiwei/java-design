package com.wayne.design.pattern.memento;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Memento {

    private String value;

    public Memento(String value) {
        this.value = value;
    }
}
