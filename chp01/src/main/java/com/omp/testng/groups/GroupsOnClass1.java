package com.omp.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "student")
public class GroupsOnClass1 {

    public void test1() {
        System.out.println("class1111111 方法11111 运行...");
    }

    public void test2() {
        System.out.println("class111111 方法22222 运行...");
    }
}
