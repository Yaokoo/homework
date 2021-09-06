package com.dao;

import com.entity.Student;
import com.vo.QueryParam;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author yaokoo
 * @create 2021/9/2 21:46
 */
public interface StudentDao {
        List<Student> selectStudents();
        int insertStudents(Student student);
        Student selectStudentById(Integer id);
        List<Student> selectParam(@Param("myname") String name,
                                  @Param("myage") int age);
        List<Student> selectObject(QueryParam queryParam);
}
