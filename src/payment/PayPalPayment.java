package payment;

public class  PayPalPayment implements PaymentStrategy {
    public String email;

    public PayPalPayment(String email){
        this.email = email;
    }

    @Override
    public  void pay(double amount){
        System.out.println("pardakht" + amount +"by email\n");
    }

    @Override
    public String getPaymentDetails(){
        return  "information pardakht: Email: " + email;
    }
}