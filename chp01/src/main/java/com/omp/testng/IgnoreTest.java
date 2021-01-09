package com.omp.testng;

import org.testng.annotations.Test;

public class IgnoreTest {

    @Test
    public void ignore1() {
        System.out.println("this method1111 缺省没有忽略...");
    }

    @Test(enabled = false)
    public void ignore2() {
        System.out.println("this method222 被忽略了...");
    }

    @Test(enabled = true)
    public void ignore3() {
        System.out.println("this method33333 设置不忽略...");
    }
}
