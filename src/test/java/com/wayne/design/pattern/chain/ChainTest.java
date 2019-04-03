package com.wayne.design.pattern.chain;

import org.junit.Test;

public class ChainTest {

    @Test
    public void method(){
        AbstractLogger loggerChain = Chain.getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");

        loggerChain.logMessage(AbstractLogger.DEBUG,
                "This is a debug level information.");

        loggerChain.logMessage(AbstractLogger.ERROR,
                "This is an error information.");
    }


}