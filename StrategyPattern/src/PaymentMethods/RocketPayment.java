package PaymentMethods;

import PaymentStrategy.PaymentStrategy;

public class RocketPayment implements PaymentStrategy {

    @Override
    public void pay() {
        System.out.println("==** Payment Completed through Rocket **==");
    }
}