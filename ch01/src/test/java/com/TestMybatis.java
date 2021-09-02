package com;

import com.entity.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author yaokoo
 * @create 2021/9/2 0:40
 */
public class TestMybatis {
    @Test
    public void testInsert() throws IOException {
        String config="mybatis.xml";
        InputStream in = Resources.getResourceAsStream(config);
        SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
        SqlSessionFactory factory= builder.build(in);
        //
        SqlSession sqlSession=factory.openSession();
        String sqlid="com.dao.StudentDao"+"."+"insertStudents";
        //
        Student student=new Student();
        student.setId(1003);
        student.setName("王五");
        student.setEmail("wangwu@qq.com");
        student.setAge(21);
        int nums=sqlSession.insert(sqlid,student);
        System.out.println("插入影响结果："+nums);
        sqlSession.commit();
        sqlSession.close();
    }
}
