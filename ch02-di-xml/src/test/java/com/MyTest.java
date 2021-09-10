package com;

import com.ba01.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yaokoo
 * @create 2021/9/6 6:35
 */
public class MyTest {
    @Test
    public void Test01(){
        String config="ba01/applicationContext.xml";
        ApplicationContext ac =new ClassPathXmlApplicationContext(config);
        Student student = (Student) ac.getBean("myStudent");
        System.out.println("stu对象"+student);
    }
    @Test
    public void Test02(){
     String config="ba02/applicationContext.xml";
     ApplicationContext ac=new ClassPathXmlApplicationContext(config);
        Object myStudent = ac.getBean("myStudent");
        System.out.println(myStudent);
    }
    @Test
    public void Test03(){
        String config="ba03/applicationContext.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(config);
        Object myStudent = ac.getBean("myStudent");
        System.out.println(myStudent);
    }
    @Test
    public void Test04(){
        String config="ba04/applicationContext.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(config);
        com.ba04.Student student = (com.ba04.Student) ac.getBean("student");
        System.out.println(student);
    }
    @Test
    public void Test05(){
        String config="ba05/total.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(config);
        com.ba05.Student student = (com.ba05.Student) ac.getBean("student");
        System.out.println(student);
    }
}
