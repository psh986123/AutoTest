package com.course.httpclient.cookies;

import org.apache.http.HttpResponse;
import org.apache.http.client.CookieStore;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;
import java.util.ResourceBundle;

/**
 * @author pengshunhong
 * @create 2020-09-24
 */
public class MyCookiesForGet {
    private String url;
    private ResourceBundle bundle;
    private CookieStore store;
    @BeforeTest
    public void beforeTest(){
        bundle = ResourceBundle.getBundle("application");
        url = bundle.getString("test.url");
    }
    @Test
    public void testGetCookies() throws IOException {
        String result;
        //从配置文件中，拼接测试的url
        String testUrl = this.url+bundle.getString("getCookies.uri");
        HttpGet get = new HttpGet(testUrl);
        //测试逻辑代码书写
        DefaultHttpClient client = new DefaultHttpClient();
        HttpResponse response = client.execute(get);
        result = EntityUtils.toString(response.getEntity(),"utf-8");
        System.out.println(result);
        //获取cookies信息
        this.store = client.getCookieStore();
        List<Cookie> cookieList = store.getCookies();
        for (Cookie cookie:cookieList) {
            String name = cookie.getName();
            String value = cookie.getValue();
            System.out.println("cookie_name:" + name + "; cookie_value:" + value);
        }
    }
    @Test(dependsOnMethods = {"testGetCookies"})
    public void testGetWithCookies() throws IOException {
        String testUrl = this.url+bundle.getString("test.get.with.cookies");
        //声明get方法
        HttpGet get = new HttpGet(testUrl);
        //声明客户端
        DefaultHttpClient client = new DefaultHttpClient();
        //设置cookies信息
        client.setCookieStore(this.store);
        //执行get请求
        HttpResponse response = client.execute(get);
        //获取相应的状态码
        int statusCode = response.getStatusLine().getStatusCode();
        System.out.println("statusCode =" + statusCode);
        if(statusCode == 200){

            //获取响应内容
            String result = EntityUtils.toString(response.getEntity(),"utf-8");
            System.out.println(result);
        }


    }

}
