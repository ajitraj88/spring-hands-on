package springAop10.services;

import springAop10.services.PaymentService;

public class PaymentServiceImpl implements PaymentService {
    public void makePayment() {
        System.out.println("Amount debited");


        System.out.println("Amount Credited");
    }
}
