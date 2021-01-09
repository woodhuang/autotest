package com.omp.testng.param;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamTest {

    @Test
    @Parameters({"name","age"})
    public void test1(String name, int age) {
        System.out.println("name = " + name + ", age = " + age);
    }

}
