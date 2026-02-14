public class CODPayment implements PaymentStrategy {

    public void pay(int amount){
        System.out.println("Cash On Delivery payment: " + amount);
    }
}
