package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

/**
 * @author pengshunhong
 * @create 2020-09-23
 */
public class GroupOnMethod {
    @Test(groups = "server")
    public void test1(){
        System.out.println("这是服务端测试1");
    }
    @Test(groups = "server")
    public void test2(){
        System.out.println("这是服务端测试2");
    }
    @Test(groups = "client")
    public void test3(){
        System.out.println("这是客户端测试3");
    }
    @Test(groups = "client")
    public void test4(){
        System.out.println("这是客户端测试4");
    }

    @BeforeGroups("server")
    public void grouTest(){
        System.out.println("方法测试组之前运行的方法11111111111");
    }
    @AfterGroups("server")
    public void afterTest(){
        System.out.println("方法测试组之后运行的方法22222222222");
    }
}
