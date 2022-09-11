package PaymentMethods;

import PaymentStrategy.PaymentStrategy;

public class NagadPayment implements PaymentStrategy {

    @Override
    public void pay() {
        System.out.println("==** Payment Completed through Nagad **==");
    }
}