package com;

import com.dao.StudentDao;
import com.entity.Student;
import com.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @author yaokoo
 * @create 2021/9/3 17:11
 */
public class SelectParam {
    public static void main(String[] args) {
        SqlSession sqlSession =MyBatisUtils.getSqlsession();
        StudentDao dao=sqlSession.getMapper(StudentDao.class);
        List<Student> students =dao.selectParam("xx",20);
        students.forEach(student -> System.out.println(student));
        sqlSession.close();
    }
}
