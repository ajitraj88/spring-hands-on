package springOrm9.dao;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;
import springOrm9.entities.Employee;

import java.util.List;

public class EmployeeDao {

    private HibernateTemplate hibernateTemplate;

    @Transactional // this annotation is needed for write operations only. For read operations don't apply on the top of that operation.
    public int insert(Employee employee) {
        // insert
        Integer empId = (Integer)this.hibernateTemplate.save(employee);
        return empId;
    }

    public Employee getEmployee(int employeeId) {
        Employee employee = this.hibernateTemplate.get(Employee.class, employeeId);
        return employee;
    }

    public List<Employee> getAllEmployee() {
        List<Employee> employeeList = this.hibernateTemplate.loadAll(Employee.class);
        return employeeList;
    }

    @Transactional
    public void deleteEmployee(int employeeId) {
        Employee employee = this.hibernateTemplate.get(Employee.class, employeeId);
        this.hibernateTemplate.delete(employee);
        System.out.println("Deleted the employee: " + employee);
    }

    @Transactional
    public void updateEmployee(Employee employee) {
        this.hibernateTemplate.update(employee);
        System.out.println("Updated the employee: " + employee);
    }

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public EmployeeDao setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
        return this;
    }
}
