public class CancelledState implements BookingState {

    public void handleStatus(){
        System.out.println("Booking Cancelled");
    }
}
