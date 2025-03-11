package payment;
import java.util.ArrayList;

public abstract class Customer {
   public String name;
   public ArrayList<String> paymentHistory;

   public Customer(String name){
       this.name = name;
       this.paymentHistory = new ArrayList<>();
   }

    public abstract void displayCustomerInfo();

    public void makePayment(PaymentStrategy paymentStrategy, double amount){
       paymentStrategy.pay(amount);
       String pay = "information pardakht: Amount: " + amount + "\n" + paymentStrategy.getPaymentDetails();;
       paymentHistory.add(pay);

    }

     public void showPaymentHistory(){
       for (String payment : paymentHistory){
           System.out.println(payment +"\n");
       }
     }


}
