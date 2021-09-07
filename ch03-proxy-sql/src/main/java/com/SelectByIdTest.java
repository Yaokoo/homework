package com;

import com.dao.StudentDao;
import com.entity.Student;
import com.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;

/**
 * @author yaokoo
 * @create 2021/9/3 15:49
 */
public class SelectByIdTest {
    public static void main(String[] args) {
        SqlSession sqlSession =MyBatisUtils.getSqlsession();
        StudentDao dao=sqlSession.getMapper(StudentDao.class);
        Student student =dao.selectStudentById(1003);
        System.out.println(student);
        sqlSession.close();
    }
}
