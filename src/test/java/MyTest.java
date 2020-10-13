import com.xiao.example.model.Employee;
import com.xiao.example.service.EmployeeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @date 10/13/2020 20:00
 */
public class MyTest {
    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmployeeService employeeService = (EmployeeService) context.getBean("EmployeeServiceImpl");
        for (Employee employee : employeeService.findAllEmployee()) {
            System.out.println(employee);
        }
    }
}
