package com.course.testng.parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

/**
 * @author pengshunhong
 * @create 2020-09-23
 */
public class DataProviderTest {
/*    @Test(dataProvider = "data")
    public void testDataProvider(String name,int age){
        System.out.println("name = " + name + "; age = " + age);

    }
    @DataProvider(name="data")
    public Object[][] dataProvide(){
        return new Object[][]{
                {"zhangsan",20},
                {"lisi",10},
                {"wangwu",30}
        };

    }*/
    @Test(dataProvider = "methodtest")
    public void test1(String name,int age){
        System.out.println("test1方法：name = " + name + "; age = " + age);
    }
    @Test(dataProvider = "methodtest")
    public void test2(String name,int age){
        System.out.println("test2方法：name = " + name + "; age = " + age);
    }
    @DataProvider(name = "methodtest")
    public Object[][] methodDataTest(Method method){
        Object[][] result = null;
        if(method.getName().equals("test1")){
            result = new Object[][]{
                    {"zhangsan",20},
                    {"lisi",10}
            };
        }else if (method.getName().equals("test2")){
            result = new Object[][]{
                    {"wangwu",36},
                    {"qianqi",45}
            };
        }
        return result;
    }
    }
