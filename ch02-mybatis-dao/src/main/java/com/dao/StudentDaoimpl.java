package com.dao;

import com.entity.Student;
import com.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @author yaokoo
 * @create 2021/9/2 21:57
 */
public class StudentDaoimpl implements StudentDao {
    @Override
    public List<Student> selectStudents() {
        SqlSession sqlSession =MyBatisUtils.getSqlsession();
        String sqlId="com.dao.StudentDao.selectStudents";
        List<Student> students=sqlSession.selectList(sqlId);
        sqlSession.close();
        return students;
    }

    @Override
    public int insertStudents(Student student) {
        SqlSession sqlSession=MyBatisUtils.getSqlsession();
        String sqlId="com.dao.StudentDao.insertStudents";
        int nums=sqlSession.insert(sqlId,student);
        sqlSession.commit();
        sqlSession.close();
        return nums;
    }
}
