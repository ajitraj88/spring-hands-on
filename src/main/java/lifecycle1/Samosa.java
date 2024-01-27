package lifecycle1;

public class Samosa {
    private double price;

    public Samosa() {
    }

    public double getPrice() {
        return price;
    }

    public Samosa setPrice(double price) {
        System.out.println("Setting the price.");
        this.price = price;
        return this;
    }

    @Override
    public String toString() {
        return "Samosa{" +
                "price=" + price +
                '}';
    }

    public void init() {
        System.out.println("Inside init method");
    }

    public void destroy() {
        System.out.println("Inside destroy method");
    }
}
