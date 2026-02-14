package structural.adapter;
public class MidtransAdapter implements PaymentAdapter {

    Midtrans midtrans = new Midtrans();

    public void pay(int amount){
        midtrans.midtransPay(amount);
    }
}
