package com.omp.testng.suite;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PayTest {

    @Test
    public void paySuccess() {
        System.out.println("pay success ...");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("before pay class run ...");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("after pay class run ...");
    }

}
