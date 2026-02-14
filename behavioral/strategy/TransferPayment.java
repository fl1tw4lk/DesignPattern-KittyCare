public class TransferPayment implements PaymentStrategy {

    public void pay(int amount){
        System.out.println("Transfer payment: " + amount);
    }
}
