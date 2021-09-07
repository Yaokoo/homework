package com;

import com.dao.StudentDao;
import com.entity.Student;
import com.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;

/**
 * @author yaokoo
 * @create 2021/9/2 22:44
 */
public class InsertTest {
    public static void main(String[] args) {
/*        StudentDao dao=new StudentDaoimpl();
        Student student=new Student();
        student.setId(1004);
        student.setName("赵四");
        student.setEmail("zhaosi@163.com");
        student.setAge(30);
        int nums=dao.insertStudents(student);
        System.out.println("添加了"+nums+"条数据");*/
        SqlSession sqlSession =MyBatisUtils.getSqlsession();
        StudentDao dao=sqlSession.getMapper(StudentDao.class);
        Student student=new Student();
        student.setId(1005);
        student.setName("xx");
        student.setEmail("xx@163.com");
        student.setAge(31);
        int nums=dao.insertStudents(student);
        sqlSession.commit();
        System.out.println("添加了"+nums+"条数据");
        sqlSession.close();
    }
}
