package PaymentMethods;

import PaymentStrategy.PaymentStrategy;

public class BKashPayment implements PaymentStrategy {

    @Override
    public void pay() {
        System.out.println("==** Payment Completed through BKash **==");
    }
}
