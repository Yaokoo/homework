package com;

import com.service.SomeService;
import com.service.impl.SomeServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yaokoo
 * @create 2021/9/6 10:01
 */
public class MyTest {
    @Test
    public void Test01(){
        SomeService service=new SomeServiceImpl();
        service.doSome();
    }
    @Test
    public void Test02(){
        String config="beans.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        SomeService service= (SomeService) ac.getBean("someservice");
        service.doSome();
    }
    @Test
    public void Test03(){
        String config="beans.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(config);
        int nums=ac.getBeanDefinitionCount();
        String[] name=ac.getBeanDefinitionNames();
        System.out.println("bean中有"+nums+"个对象");
        for(String n:name){
            System.out.println(n);
        }
    }
    @Test
    public void Test04(){
        String config="beans.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(config);
        Object myDate = ac.getBean("mydate");
        System.out.println(myDate);
    }
}
