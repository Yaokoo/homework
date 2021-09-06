package com;

import com.dao.StudentDao;
import com.entity.Student;
import com.utils.MyBatisUtils;
import com.vo.QueryParam;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @author yaokoo
 * @create 2021/9/3 17:28
 */
public class SelectObject {
    public static void main(String[] args) {
        SqlSession sqlSession =MyBatisUtils.getSqlsession();
        StudentDao dao=sqlSession.getMapper(StudentDao.class);
        QueryParam queryParam=new QueryParam();
        queryParam.setNo(1002);
        queryParam.setName("xx");
        List<Student> students =dao.selectObject(queryParam);
        students.forEach(student -> System.out.println(student));
        sqlSession.close();
    }
}
