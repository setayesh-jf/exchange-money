package payment;

public class PremiumCustomer extends Customer{
    public PremiumCustomer(String name){
        super(name);
    }

    @Override
    public  void displayCustomerInfo(){
        System.out.println("Customer Name: " + name + "\n");
        System.out.println("Payment History Customer: " + paymentHistory + "\n");
    }

}
