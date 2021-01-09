package com.omp.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class OtherSuiteConfig {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("before other suite run ...");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("after other suite run ...");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("before other suite test run ...");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("after other suite test run ...");
    }

}
