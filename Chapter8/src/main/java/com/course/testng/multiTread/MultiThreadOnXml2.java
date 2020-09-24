package com.course.testng.multiTread;

import org.testng.annotations.Test;

/**
 * @author pengshunhong
 * @create 2020-09-23
 */
public class MultiThreadOnXml2 {
    @Test
    public void test1(){
        System.out.printf("（方法四）Thread Id : %s%n",Thread.currentThread().getId());
    }
    @Test
    public void test2(){
        System.out.printf("（方法五）Thread Id : %s%n",Thread.currentThread().getId());
    }
    @Test
    public void test3(){
        System.out.printf("（方法六）Thread Id : %s%n",Thread.currentThread().getId());
    }
}
