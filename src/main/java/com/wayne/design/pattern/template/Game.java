package com.wayne.design.pattern.template;

/**
 * @Author: waynechin
 * @Date: 2019/3/29 17:20
 */
public abstract class Game {

    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    //行为模板 -- 与建造者的区别是类的行为而不是对象的创建
    //公开定义了执行它的方法的方式/模板
    public final void play(){
        //初始化游戏
        initialize();
        //开始游戏
        startPlay();
        //结束游戏
        endPlay();
    }

}
