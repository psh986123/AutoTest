package com.course.testng.groups;

import org.testng.annotations.Test;

/**
 * @author pengshunhong
 * @create 2020-09-23
 */
@Test(groups = "tech")
public class GroupOnClass1 {
    public void goupOnClass(){
        System.out.println("GroupOnClass1运行111111");
    }
}
