package com.omp.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "student")
public class GroupsOnClass2 {

    public void test21() {
        System.out.println("class2222 方法11111 运行...");
    }

    public void test22() {
        System.out.println("class22222 方法2222 运行...");
    }
}
