package com.wayne.design.pattern.memento;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Original {

    private String value;

    public Original(String egg) {
        this.value = egg;
    }

    /**
     * 这个跟原型方法类似：主要区别是原型关注的是new
     * 备忘录模式关注的备份还原的行为
     */


    /**
     * 原对象提供保存当前状态的方法
     * @return
     */
    public Memento saveState(){
        return new Memento(this.value);
    }

    /**
     * 提供还原当前对象的方法
     * @param memento
     */
    public void restore(Memento memento){
        this.value = memento.getValue();
    }



}
