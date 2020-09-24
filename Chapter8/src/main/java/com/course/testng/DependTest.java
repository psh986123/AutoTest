package com.course.testng;

import org.testng.annotations.Test;

/**
 * @author pengshunhong
 * @create 2020-09-23
 */
public class DependTest {
    @Test
    public void test1(){
        System.out.println("这是测试方法11111");
    }
    @Test(dependsOnMethods = {"test1"})//如果被依赖的方法抛出异常，则test2会被忽略
    public void test2(){
        System.out.println("这是测试方法22222");
    }
}
