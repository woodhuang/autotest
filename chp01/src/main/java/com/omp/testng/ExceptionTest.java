package com.omp.testng;

import org.testng.annotations.Test;

public class ExceptionTest {

    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionTestFailed() {
        System.out.println("这里不会抛出异常，异常测试不成功");
    }

    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionTestSucc() {
        System.out.println("这里会抛出想要的异常，异常测试成功...");
        throw new RuntimeException();
    }

}
