package com.omp.testng.param;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {

    @Test(dataProvider = "dataPool")
    public void testDataProd(String name, int age) {
        System.out.println("name = " + name + ", age = " + age);
    }

    @DataProvider(name = "dataPool")
    public Object[][] dataProvider() {
        Object[][] obj = new Object[][] {
                {"zhangsan", 15},
                {"lisi", 25},
                {"wangwu", 35},
                {"zhaoliu", 45}
        };
        return obj;
    }

    @Test(dataProvider = "methodData")
    public void test1(String name, int age) {
        System.out.println("test11111 name = " + name + ", age = " + age);
    }
    @Test(dataProvider = "methodData")
    public void test2(String name, int age) {
        System.out.println("test22222 name = " + name + ", age = " + age);
    }

    @DataProvider(name = "methodData")
    public Object[][] dataProvid(Method methd) {
        Object[][] o = null;
        if (methd.getName().equals("test1")) {
            o = new Object[][] {
                    {"aaaa", 18},
                    {"bbbb", 28}
            };
        } else {
            o = new Object[][] {
                    {"cccccc", 38},
                    {"dddddd", 69}
            };
        }
        return o;
    }

}
