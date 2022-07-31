package PaymentMethods;

import PaymentStrategy.PaymentStrategy;

public class CreditCardPayment implements PaymentStrategy {

    @Override
    public void pay() {
        System.out.println("==** Payment Completed through Credit Card **==");
    }
}
