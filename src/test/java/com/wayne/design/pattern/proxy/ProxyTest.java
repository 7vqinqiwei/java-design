package com.wayne.design.pattern.proxy;

import org.apache.tomcat.util.http.fileupload.ByteArrayOutputStream;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.*;

/**
 * @Author: waynechin
 * @Date: 2019/3/29 10:30
 */
public class ProxyTest {

    @Test
    public void method() throws Exception {
        Sourceable source = new Source();
        // 代理模式：与装饰器模式中对比就是代理模式全权代理source目标可执行可校验执行
        // 但是装饰器只能增强当前source不能影响source的执行
        // 例如: OutputStream out = new DataOutputStream(new FileOutputStream("test.txt"));
        Sourceable proxy = new Proxy(source);
        proxy.method();

    }
}