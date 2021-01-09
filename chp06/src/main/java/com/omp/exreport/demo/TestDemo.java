package com.omp.exreport.demo;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestDemo {

    @Test
    public void test1() {
        Assert.assertEquals(1, 1);
    }

    @Test
    public void test2() {
        Assert.assertEquals(1, 2);
    }

    @Test
    public void test3() {
        Assert.assertEquals("aaaa", "aaaa");
    }

    @Test
    public void logDemo() {
        Reporter.log("This is report log here...");
        throw new RuntimeException("这是异常测试log...");
    }
}
