package com;

import com.dao.StudentDao;
import com.dao.StudentDaoimpl;
import com.entity.Student;

import java.util.List;

/**
 * @author yaokoo
 * @create 2021/9/2 22:00
 */
public class SelectTest {
    public static void main(String[] args) {
        StudentDao dao=new StudentDaoimpl();
        List<Student> students =dao.selectStudents();
        students.forEach(student -> System.out.println(student));

    }
}
