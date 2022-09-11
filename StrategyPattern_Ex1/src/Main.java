import Payment.Payment;
import PaymentMethods.BKashPayment;
import PaymentMethods.CreditCardPayment;
import PaymentMethods.NagadPayment;
import PaymentMethods.RocketPayment;
import PaymentMethodsNames.PaymentMethodNames;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("==** Choose your payment method: ");

        String paymentMethod = sc.nextLine();
        PaymentMethodNames paymentMethodNames = PaymentMethodNames.valueOf(paymentMethod.toUpperCase());

        Payment payment = new Payment();

        switch (paymentMethodNames) {
            case BKASH:
                payment.setStrategy(new BKashPayment());
                payment.executeStrategy();
                break;

            case NAGAD:
                payment.setStrategy(new NagadPayment());
                payment.executeStrategy();
                break;

            case ROCKET:
                payment.setStrategy(new RocketPayment());
                payment.executeStrategy();
                break;

            case CREDIT_CARD:
                payment.setStrategy(new CreditCardPayment());
                payment.executeStrategy();
                break;
        }
    }
}