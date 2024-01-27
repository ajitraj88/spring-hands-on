package springOrm9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springOrm9.dao.EmployeeDao;
import springOrm9.entities.Employee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class SpringOrm {

    public static void main(String[] args) throws IOException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("file:src/main/resources/spring-orm-config.xml");
        EmployeeDao employeeDao = applicationContext.getBean("employeeDao", EmployeeDao.class);

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("PRESS-1 to add new Employee");
        System.out.println("PRESS-2 to display all Employees");
        System.out.println("PRESS-3 to get details of single Employee");
        System.out.println("PRESS-4 to delete an Employee");
        System.out.println("PRESS-5 to update an Employee");
        System.out.println("PRESS-6 to exit");

        boolean toContinue = true;
        while (toContinue) {
            int choice = Integer.parseInt(bufferedReader.readLine());
            switch (choice) {
                case 1:
                    System.out.println("Enter employee details as id, name and city");
                    int employeeId = Integer.parseInt(bufferedReader.readLine());
                    String name = bufferedReader.readLine();
                    String city = bufferedReader.readLine();
                    int empId = employeeDao.insert(new Employee(employeeId, name, city));
                    System.out.println("Id of the inserted employee is: " + empId);
                    break;
                case 2:
                    List<Employee> employeeList = employeeDao.getAllEmployee();
                    for (Employee employee : employeeList) {
                        System.out.println(employee.toString());
                    }
                    break;
                case 3:
                    System.out.println("Enter employeeId whose details are to be fetched");
                    empId = Integer.parseInt(bufferedReader.readLine());
                    Employee employee = employeeDao.getEmployee(empId);
                    System.out.println("Fetched employee details are: " + employee.toString());
                    break;
                case 4:
                    System.out.println("Enter employeeId whose details are to be deleted");
                    empId = Integer.parseInt(bufferedReader.readLine());
                    employeeDao.deleteEmployee(empId);
                    break;
                case 5:
                    System.out.println("Enter employee details as id, name and city which is to be updated");
                    employeeId = Integer.parseInt(bufferedReader.readLine());
                    name = bufferedReader.readLine();
                    city = bufferedReader.readLine();
                    employeeDao.updateEmployee(new Employee(employeeId, name, city));
                    break;
                case 6:
                    toContinue = false;
                    break;
                default:
                    System.out.println("Input didn't match any available options");
            }
        }

    }
}
