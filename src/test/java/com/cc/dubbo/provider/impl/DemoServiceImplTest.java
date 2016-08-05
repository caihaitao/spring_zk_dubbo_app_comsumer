package com.cc.dubbo.provider.impl;

import java.io.IOException;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.cc.dubbo.provider.DemoService;
import com.cc.test.BaseTest;

/**
 * 
 * @since 1.0.0
 * @version $Id$
 */
public class DemoServiceImplTest extends BaseTest{
    
    @Autowired
    private DemoService demoService;

    @Test
    public void testConsumer() throws IOException {
       System.out.println(demoService.sayHello("caicai")); 
       System.in.read();
    }
}
