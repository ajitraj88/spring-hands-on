package lifecycle1;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean, DisposableBean {
    private double price;

    public Pepsi() {
    }

    public Pepsi(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public Pepsi setPrice(double price) {
        this.price = price;
        return this;
    }

    @Override
    public String toString() {
        return "Pepsi{" +
                "price=" + price +
                '}';
    }

    public void afterPropertiesSet() throws Exception {
        // this runs after setting the properties ie init method
        // init method & comes from InitializingBean
        System.out.println("Drinking the Pepsi.");
    }

    public void destroy() throws Exception {
        // destroy method & comes from DisposableBean
        System.out.println("Disposing the Pepsi bottle now.");
    }
}
