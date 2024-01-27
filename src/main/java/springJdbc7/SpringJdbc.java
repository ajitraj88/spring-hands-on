package springJdbc7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springJdbc7.dao.StudentDao;
import springJdbc7.entities.Student;

import java.util.List;

public class SpringJdbc {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("file:src/main/resources/spring-jdbc-config.xml");
        StudentDao studentDao = (StudentDao) applicationContext.getBean("studentDao");

        // Insert
//        studentDao.insert(new Student(8, "Rohit", "Mumbai"));
//        studentDao.insert(new Student(18, "Virat", "Mumbai"));
//        studentDao.insert(new Student(45, "Rohit", "Mumbai"));

        // Update
        studentDao.update(new Student(45, "Rohit Sharma", "Pune"));

        // Delete
//        studentDao.delete(4444);

        // Select one
//        Student student = studentDao.getStudent(44);
//        System.out.println(student.toString());

        // select all
        List<Student> studentList = studentDao.getAllStudents();
        for (Student currStudent: studentList) {
            System.out.println(currStudent.toString());
        }

    }
}
