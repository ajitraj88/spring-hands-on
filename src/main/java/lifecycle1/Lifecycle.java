package lifecycle1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lifecycle {
    public static void main(String[] args) {
        AbstractApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("file:src/main/resources/lifecycle-config.xml");

        Samosa samosa = (Samosa) applicationContext.getBean("samosa");
        System.out.println(samosa.toString());
        // registerShutdownHook this method is there in AbstractApplicationContext and not in ApplicationContext.
        // this is used to call the destroy function. It will call the destroy method specified in the config file for this bean.
        applicationContext.registerShutdownHook();

        Pepsi pepsi = (Pepsi) applicationContext.getBean("pepsi");
        System.out.println(pepsi.toString());
        applicationContext.registerShutdownHook();

        Example example = (Example) applicationContext.getBean("example");
        System.out.println(example.toString());
        applicationContext.registerShutdownHook();

    }
}
