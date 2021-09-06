package com;

import com.dao.StudentDao;
import com.entity.Student;
import com.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @author yaokoo
 * @create 2021/9/2 22:00
 */
public class SelectTest {
    public static void main(String[] args) {
        SqlSession sqlSession =MyBatisUtils.getSqlsession();
        //动态代理
        StudentDao studentDao=sqlSession.getMapper(StudentDao.class);
        List<Student> students=studentDao.selectStudents();
        students.forEach(student -> System.out.println(student));
        sqlSession.close();
    }
}
