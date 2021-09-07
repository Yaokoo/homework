package com.utils;

import com.mysql.cj.Session;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author yaokoo
 * @create 2021/9/2 21:48
 */
public class MyBatisUtils {
    private static SqlSessionFactory factory=null;

    static {
        String config="mybatis.xml";
        try {
            InputStream in=Resources.getResourceAsStream(config);
            factory=new SqlSessionFactoryBuilder().build(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static SqlSession getSqlsession(){
        SqlSession sqlSession=null;
        if (factory != null) {
           sqlSession=factory.openSession();
        }
        return sqlSession;
    }
}
