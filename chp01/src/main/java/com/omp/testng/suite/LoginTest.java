package com.omp.testng.suite;

import org.testng.annotations.*;

public class LoginTest {

    @Test
    public void loginSuccess() {
        System.out.println("login test success ...");
    }

    @Test
    public void loginSuccessPost() {
        System.out.println("login test success post ...");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("before login class run ...");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("after login class run ...");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("before login method run ...");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("after login method run ...");
    }



}
