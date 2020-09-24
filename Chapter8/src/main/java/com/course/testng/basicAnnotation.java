package com.course.testng;


import org.testng.annotations.*;

/**
 * @author pengshunhong
 * @create 2020-09-22
 */
public class basicAnnotation {
    @Test //最基本的注解，用来标示方法是测试的一部分
    public void testCase1(){
        System.out.println("这是测试用例1");
    }
    @Test //最基本的注解，用来标示方法是测试的一部分
    public void testCase2(){
        System.out.println("这是测试用例2");
    }
    @BeforeMethod //最基本的注解，用来标示方法是测试的一部分
    public void beforeMethod(){
        System.out.println("beforeMethod是测试方法运行之前的方法");
    }
    @AfterMethod //最基本的注解，用来标示方法是测试的一部分
    public void afterMethod(){
        System.out.println("afterMethod是测试方法运行之后的方法");
    }
    @BeforeClass //最基本的注解，用来标示方法是测试的一部分
    public void beforeClass(){
        System.out.println("beforeClass是类运行之前的方法");
    }
    @AfterClass //最基本的注解，用来标示方法是测试的一部分
    public void afterClass(){
        System.out.println("afterClass是类运行之后的方法");
    }
}
