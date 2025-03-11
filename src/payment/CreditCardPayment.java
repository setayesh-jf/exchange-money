package payment;

public class CreditCardPayment implements PaymentStrategy{
    public String cardNumber;
    public String cardHolderName;

public CreditCardPayment(String cardNumber, String cardHolderName){
    this.cardNumber = cardNumber;
    this.cardHolderName = cardHolderName;
}
    @Override
    public  void pay(double amount){
    System.out.println("pardakht" + amount +"by use creditcardPayment\n");
    }

    @Override
    public String getPaymentDetails(){
      return  "information pardakht: Card Number: " + cardNumber +"\nCard HolderName: " + cardHolderName;
    }

}
