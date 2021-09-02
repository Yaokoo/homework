import com.entity.Student;
import com.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @author yaokoo
 * @create 2021/9/2 15:14
 */
public class MyApp2 {
    public static void main(String[] args) {
        SqlSession sqlSession =MyBatisUtils.getSqlSession();
        String sqlId="com.dao.StudentDao"+"."+"selectStudents";
        List<Student> students =sqlSession.selectList(sqlId);
        students.forEach(student -> System.out.println(student));
        sqlSession.close();
    }
}
