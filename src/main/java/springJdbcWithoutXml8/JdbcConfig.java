package springJdbcWithoutXml8;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import springJdbc7.dao.StudentDao;
import springJdbc7.dao.StudentDaoImpl;

@Configuration
public class JdbcConfig {

    @Bean("dataSource")
    public DriverManagerDataSource getDataSource() {
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        driverManagerDataSource.setUrl("jdbc:mysql://127.0.0.1:3306/springJdbc?autoReconnect=true&useSSL=false");
        driverManagerDataSource.setUsername("root");
        driverManagerDataSource.setPassword("Qwerty@1234");

        return driverManagerDataSource;
    }

    @Bean("jdbcTemplate")
    public JdbcTemplate getJdbcTemplate() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(getDataSource());

        return jdbcTemplate;
    }

    @Bean("studentDao")
    public StudentDao getStudentDao() {
        StudentDaoImpl studentDao = new StudentDaoImpl();
        studentDao.setJdbcTemplate(getJdbcTemplate());

        return studentDao;
    }
}
