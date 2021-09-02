package com.dao;

import com.entity.Student;

import java.util.List;

/**
 * @author yaokoo
 * @create 2021/9/1 15:22
 */
public interface StudentDao {
    public List<Student> selectStudents();
    public int insertStudents(Student student);
}
