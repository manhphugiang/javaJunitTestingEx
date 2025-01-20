package com.sheridan;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HelloTest {
    @Test
    public void testSayHello(){
        Hello hello = new Hello();
        String result = hello.sayHello();
        assertEquals("Hello World", result);
    }
    
}
