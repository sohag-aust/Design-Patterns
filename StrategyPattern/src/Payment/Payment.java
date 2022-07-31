package Payment;

import PaymentStrategy.PaymentStrategy;

public class Payment {

    private PaymentStrategy paymentStrategy;

    public void setStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void executeStrategy() {
        paymentStrategy.pay();
    }
}
