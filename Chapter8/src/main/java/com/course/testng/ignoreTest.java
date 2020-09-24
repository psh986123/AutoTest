package com.course.testng;

import org.testng.annotations.Test;

/**
 * @author pengshunhong
 * @create 2020-09-23
 */
public class ignoreTest {
    @Test(enabled = false)
    public void ignore1(){
        System.out.println("忽略测试1");
    }
    @Test(enabled = true)
    public void ignore2(){
        System.out.println("忽略测试2");
    }
}
