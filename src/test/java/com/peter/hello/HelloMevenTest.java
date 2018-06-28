package com.peter.hello;

import org.junit.Assert;
import org.junit.Test;

public class HelloMevenTest {

    @Test
    public void sayHello() {
        HelloMeven hello = new HelloMeven();
        Assert.assertEquals("HHH", hello.hhh);
        hello.sayHello();
    }
}