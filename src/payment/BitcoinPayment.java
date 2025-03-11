package payment;

public class BitcoinPayment implements PaymentStrategy{
   public String walletAddress;

   public BitcoinPayment(String walletAddress){
       this.walletAddress = walletAddress;
   }

    @Override
    public  void pay(double amount){
        System.out.println("pardakht" + amount +"by Bitcoin\n");
    }

    @Override
    public String getPaymentDetails(){
        return  "information pardakht:Wallet Address: " + walletAddress;
    }
}
