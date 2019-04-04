package com.wayne.design.pattern.interpreter;

import org.junit.Test;

public class ExpressionTest {

    @Test
    public void method(){
        Expression isMale = InterpreterPattern.getMaleExpression();
        Expression isMarriedWoman = InterpreterPattern.getMarriedWomanExpression();

        System.out.println("John is male? " + isMale.interpret("John"));
        System.out.println("Julie is a married women? "
                + isMarriedWoman.interpret("Married Julie"));

    }

}