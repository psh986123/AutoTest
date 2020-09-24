package com.course.testng.multiTread;

import org.testng.annotations.Test;

/**
 * @author pengshunhong
 * @create 2020-09-23
 */
public class MultiThreadOnXml1 {
    @Test
    public void test1(){
        System.out.printf("（方法一）Thread Id : %s%n",Thread.currentThread().getId());
    }
    @Test
    public void test2(){
        System.out.printf("（方法二）Thread Id : %s%n",Thread.currentThread().getId());
    }
    @Test
    public void test3(){
        System.out.printf("（方法三）Thread Id : %s%n",Thread.currentThread().getId());
    }
}
