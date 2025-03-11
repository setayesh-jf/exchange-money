package payment;

public class RegularCustomer extends Customer {
    public RegularCustomer(String name){
        super(name);
    }

    @Override
    public  void displayCustomerInfo(){
        System.out.println("Customer Name: " + name + "\n");
        System.out.println("Payment History Customer: " + paymentHistory + "\n");
    }
}
