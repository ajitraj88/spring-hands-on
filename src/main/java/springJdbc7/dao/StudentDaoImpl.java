package springJdbc7.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import springJdbc7.entities.Student;

import java.util.List;

public class StudentDaoImpl implements StudentDao {

    private JdbcTemplate jdbcTemplate;

    public int insert(Student student) {
        String query = "insert into student(id, name, city) values(?, ?, ?)";
        int result = this.jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
        return result;
    }

    public int update(Student student) {
        String query = "update student set name=?, city=? where id=?";
        int result = this.jdbcTemplate.update(query, student.getName(), student.getCity(), student.getId());
        return result;
    }

    public int delete(int studentId) {
        String query = "delete from student where id=?";
        int result = this.jdbcTemplate.update(query, studentId);
        return result;
    }

    public Student getStudent(int studentId) {
        String query = "select * from student where id=?";
        RowMapper<Student> rowMapper = new RowMapperImpl();

        Student student = this.jdbcTemplate.queryForObject(query, rowMapper,studentId);
        return student;
    }

    public List<Student> getAllStudents() {
        String query = "select * from student";
        RowMapper<Student> rowMapper = new RowMapperImpl();

        List<Student> studentList = this.jdbcTemplate.query(query, rowMapper);
        return studentList;
    }

    public JdbcTemplate getJdbcTemplate(){
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

}
