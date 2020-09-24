package com.course.testng.multiTread;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * @author pengshunhong
 * @create 2020-09-23
 */
public class MultiTreadOnAnnotion {
/*    //单个测试方法多线程执行
    @Test(invocationCount = 10,threadPoolSize = 3)
    public void test(){
        System.out.println(1);
        System.out.printf("Thread Id : %s%n",Thread.currentThread().getId());
    }*/

    //多个测试方法多个线程并发执行
    @Test(dataProvider = "test2")
    public void test2(String param1,String param2){
        long id = Thread.currentThread().getId();
        System.out.println(param1+"     "+param2 + " thread id:"+id);
    }
    @Test(dataProvider = "test1")
    public void test1(String param1,String param2){
        long id = Thread.currentThread().getId();
        System.out.println(param1+"     "+param2 + " thread id:"+id);
    }
    @DataProvider(name = "test2")
    public static Object[][] parallel2Test(){
        return new Object[][]{
                {"dataprovider test2 data1","dataprovider test2 data1"},
                {"dataprovider test2 data2","dataprovider test2 data2"}};
    }
    @DataProvider(name = "test1")
    public static Object[][] parallel1Test(){
        return new Object[][]{
                {"dataprovider test1 data1","dataprovider test1 data1"},
                {"dataprovider test1 data2","dataprovider test1 data2"}};
    }

}
