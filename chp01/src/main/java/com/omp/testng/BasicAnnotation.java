package com.omp.testng;

import org.testng.annotations.*;

public class BasicAnnotation {

    @Test
    public void testCase1() {
        System.out.println("test case 1111......");
    }

    @Test
    public void testCase2() {
        System.out.println("test case 22222....");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("before test ....");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("after test .....");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("方法之前运行的内容 before method...");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("方法之后运行的内容 after method...");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Class 之前运行的....");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("Class 之后运行的....");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("before Suite 运行! ");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("after Suite 运行！ ");
    }

}
