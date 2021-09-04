package com;

import com.dao.StudentDao;
import com.dao.StudentDaoimpl;
import com.entity.Student;

/**
 * @author yaokoo
 * @create 2021/9/2 22:44
 */
public class InsertTest {
    public static void main(String[] args) {
        StudentDao dao=new StudentDaoimpl();
        Student student=new Student();
        student.setId(1004);
        student.setName("赵四");
        student.setEmail("zhaosi@163.com");
        student.setAge(30);
        int nums=dao.insertStudents(student);
        System.out.println("添加了"+nums+"条数据");
    }
}
