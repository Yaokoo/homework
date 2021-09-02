import com.entity.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.session.defaults.DefaultSqlSessionFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author yaokoo
 * @create 2021/9/1 16:13
 */
public class MyApp {
    public static void main(String[] args) throws IOException {
        String config="mybatis.xml";
        InputStream in =Resources.getResourceAsStream(config);
        SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
        SqlSessionFactory factory= builder.build(in);
        //
        SqlSession sqlSession=factory.openSession();
        String sqlid="com.dao.StudentDao"+"."+"selectStudents";
        //
        List<Student> studentList=sqlSession.selectList(sqlid);
        studentList.forEach(stu -> System.out.println(stu));
        sqlSession.close();
    }
}
