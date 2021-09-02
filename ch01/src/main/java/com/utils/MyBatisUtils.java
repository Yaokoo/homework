package com.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.annotation.Resource;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author yaokoo
 * @create 2021/9/2 14:53
 */
public class MyBatisUtils {
    private static SqlSessionFactory factory=null;
    static {
        String config="mybatis.xml";
        try {
            InputStream in =Resources.getResourceAsStream(config);
            factory=new SqlSessionFactoryBuilder().build(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static SqlSession getSqlSession(){
        SqlSession sqlSession=null;
        if (factory != null) {
            sqlSession=factory.openSession();
        }
        return sqlSession;
    }
}
