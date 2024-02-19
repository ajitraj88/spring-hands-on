package springAop10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springAop10.services.PaymentServiceImpl;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("file:src/main/resources/spring-aop-config.xml");
        PaymentServiceImpl paymentService = applicationContext.getBean("paymentServiceImpl", PaymentServiceImpl.class);
        paymentService.makePayment();

    }
}
