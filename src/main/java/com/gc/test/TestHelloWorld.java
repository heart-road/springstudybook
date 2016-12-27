package com.gc.test;

import com.gc.action.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by runda on 2016/12/26.
 */
public class TestHelloWorld {
    public static void main(String[] args) {
        //通过ApplicationContext 来获取Spring的配置文件
        ApplicationContext actx = new FileSystemXmlApplicationContext("config.xml");
        //通过Bean的id来获取Bean
        HelloWorld helloWorld = (HelloWorld) actx.getBean("HelloWorld");
        System.out.println(helloWorld.getMsg());
    }
}
