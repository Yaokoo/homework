package com.dao;

import com.entity.Student;

import java.util.List;

/**
 * @author yaokoo
 * @create 2021/9/2 21:46
 */
public interface StudentDao {
        List<Student> selectStudents();
        int insertStudents(Student student);
}
