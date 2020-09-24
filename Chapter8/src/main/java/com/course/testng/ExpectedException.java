package com.course.testng;

import org.testng.annotations.Test;

/**
 * @author pengshunhong
 * @create 2020-09-23
 */
public class ExpectedException {
    //这是一个测试结果会失败的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFaile(){
        System.out.println("这是一个异常失败的测试");
    }

    //这是一个成功的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccess(){
        System.out.println("这是一个异常成功的测试");
        throw new RuntimeException();
    }
}
