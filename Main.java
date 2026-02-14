import structural.adapter.*;
import structural.decorator.*;
import structural.facade.BookingFacade;
import creational.singleton.DatabaseConnection;
import creational.factory.*;
import creational.builder.Booking;
import behavioral.observer.*;
import behavioral.strategy.*;
import behavioral.state.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== SINGLETON ===");
        DatabaseConnection db = DatabaseConnection.getInstance();
        db.connect();

        System.out.println("\n=== FACTORY METHOD ===");
        Service service = ServiceFactory.createService("grooming");
        service.execute();

        System.out.println("\n=== BUILDER ===");
        Booking booking = new Booking.BookingBuilder()
                .setDate("12 Feb 2026")
                .setService("Grooming")
                .setNote("Kucing Persia")
                .build();

        System.out.println("Booking created: " + booking);

        System.out.println("\n=== ADAPTER ===");
        PaymentAdapter adapter = new MidtransAdapter();
        adapter.pay(150000);

        System.out.println("\n=== DECORATOR ===");
        Grooming grooming = new VitaminDecorator(new BasicGrooming());
        grooming.cost();

        System.out.println("\n=== FACADE ===");
        BookingFacade facade = new BookingFacade();
        facade.processBooking();

        System.out.println("\n=== OBSERVER ===");
        Observer userObs = new UserNotification();
        Observer adminObs = new AdminNotification();
        userObs.update("Booking baru dibuat");
        adminObs.update("Booking baru masuk");

        System.out.println("\n=== STRATEGY ===");
        PaymentStrategy payment = new TransferPayment();
        payment.pay(200000);

        System.out.println("\n=== STATE ===");
        BookingState state = new PendingState();
        state.handleStatus();
    }
}
