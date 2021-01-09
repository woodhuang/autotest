package com.omp.testng.suite;

import org.testng.annotations.*;

public class SuiteConfig {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("before suite ...");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("after suite ...");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("before test ...");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("after test ...");
    }

    //不起作用
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("before method ...");
    }

    //不起作用
    @AfterMethod
    public void afterMethod() {
        System.out.println("after method ...");
    }

}
