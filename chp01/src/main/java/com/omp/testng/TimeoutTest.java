package com.omp.testng;

import org.junit.rules.Timeout;
import org.testng.annotations.Test;

public class TimeoutTest {

    @Test(timeOut = 3000)
    public void testSuccess() throws InterruptedException {
        Thread.sleep(2000);
    }

    @Test(timeOut = 2000)
    public void testFailed() throws InterruptedException {
        Thread.sleep(3000);
    }
}
