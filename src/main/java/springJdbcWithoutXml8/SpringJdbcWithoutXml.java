package springJdbcWithoutXml8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springJdbc7.dao.StudentDao;
import springJdbc7.entities.Student;

import java.util.List;

public class SpringJdbcWithoutXml {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(JdbcConfig.class);
        StudentDao studentDao = (StudentDao) applicationContext.getBean("studentDao");

        List<Student> studentList = studentDao.getAllStudents();
        for (Student currStudent: studentList) {
            System.out.println(currStudent.toString());
        }
    }
}
