import payment.*;

public class Main {
    public static void main(String[] args) {

        PremiumCustomer premiumCustomer1 = new PremiumCustomer("Maryam");
        PremiumCustomer premiumCustomer2 = new PremiumCustomer("Roza");
        RegularCustomer regularCustomer = new RegularCustomer("Pari");


        CreditCardPayment creditCardPaymentMaryam = new CreditCardPayment("6104-7759-6310-9956", "Maryam Senobar");
        BitcoinPayment bitcoinPaymentRoza = new BitcoinPayment("33273");
        PayPalPayment payPalPaymentPari = new PayPalPayment("Pari566@gmail.com");

        premiumCustomer1.makePayment(creditCardPaymentMaryam, 300.89);
        premiumCustomer1.makePayment(creditCardPaymentMaryam, 900.334);

        premiumCustomer2.makePayment(bitcoinPaymentRoza, 1800.877);
        premiumCustomer2.makePayment(bitcoinPaymentRoza, 2600.899);

        regularCustomer.makePayment(payPalPaymentPari, 800.566);
        regularCustomer.makePayment(payPalPaymentPari, 666.990);

        premiumCustomer1.displayCustomerInfo();
        premiumCustomer2.displayCustomerInfo();
        regularCustomer.displayCustomerInfo();

        System.out.println("paymentHistory Maryam\n");
        premiumCustomer1.showPaymentHistory();

        System.out.println("paymentHistory Roza\n");
        premiumCustomer2.showPaymentHistory();

        System.out.println("paymentHistory Pari\n");
        regularCustomer.showPaymentHistory();


    }
}