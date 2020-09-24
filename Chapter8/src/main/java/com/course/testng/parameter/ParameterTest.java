package com.course.testng.parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * @author pengshunhong
 * @create 2020-09-23
 */
public class ParameterTest {
    @Test
    @Parameters({"name","age"})
    public void test(String name,int age){
        System.out.println("name=" + name + "; age=" + age);

    }
}
