package com.wayne.design.pattern.template;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Author: waynechin
 * @Date: 2019/3/29 17:22
 */
public class GameTest {

    @Test
    public void play() {
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}