public class EWalletPayment implements PaymentStrategy {

    public void pay(int amount){
        System.out.println("E-Wallet payment: " + amount);
    }
}
