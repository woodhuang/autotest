package com.omp.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {

    @Test(groups = {"teach"})
    public void test1() {
        System.out.println("server test1111 run ...");
    }

    @Test(groups = {"teach"})
    public void test2() {
        System.out.println("server test222222 run ...");
    }

    @Test(groups = "stu")
    public void test3() {
        System.out.println("client test33333 run ...");
    }

    @Test(groups = "stu")
    public void test4() {
        System.out.println("client test4444 run ...");
    }

    @BeforeGroups("teach")
    public void beforeGroupsOnTeach() {
        System.out.println("before teach groups run ...");
    }

    @AfterGroups("teach")
    public void afterGroupsOnTeach() {
        System.out.println("after teach groups run ...");
    }

    @BeforeGroups("stu")
    public void beforeGroupsOnStu() {
        System.out.println("before stu groups run ...");
    }

    @AfterGroups("stu")
    public void afterGroupsOnStu() {
        System.out.println("after stu groups run ...");
    }

}
