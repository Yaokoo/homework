package com;

import com.dao.StudentDao;
import com.entity.Student;
import com.github.pagehelper.PageHelper;
import com.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yaokoo
 * @create 2021/9/5 0:22
 */
public class TestMybatis {
    @Test
    public void iFTest(){
        SqlSession sqlSession =MyBatisUtils.getSqlsession();
        StudentDao dao=sqlSession.getMapper(StudentDao.class);
        Student student=new Student();
        student.setName("xx");
        student.setAge(20);
        List<Student> students =dao.selectStudentIf(student);
        students.forEach(student1 -> System.out.println(student1));
        sqlSession.close();
    }
    @Test
    public void forTest(){
        SqlSession sqlSession =MyBatisUtils.getSqlsession();
        StudentDao dao=sqlSession.getMapper(StudentDao.class);
        List<Integer> list=new ArrayList<>();
        list.add(1001);
        list.add(1002);
        list.add(1003);
        List<Student> students=dao.selectStudentFor(list);
        for(Student stu:students){
            System.out.println(stu);
        }
        sqlSession.close();
    }
    @Test
    public void PageTest(){
        SqlSession sqlSession =MyBatisUtils.getSqlsession();
        StudentDao dao=sqlSession.getMapper(StudentDao.class);
        PageHelper.startPage(1,3);
        List<Student> students=dao.selectStudentPage();

        students.forEach(student -> System.out.println(student));
        sqlSession.close();
    }
}
