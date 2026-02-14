public class BookingContext {
    private BookingState currentState;

    public void setState(BookingState state) {
        this.currentState = state;
    }

    public void applyStatus() {
        if (currentState != null) {
            currentState.handleStatus();
        }
    }
}