package com.wayne.design.rpc.common;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@ToString
public class User implements Serializable {
    private static final long serialVersionUID = -490352832325970400L;

    private @Setter
    @Getter
    String name;

}
