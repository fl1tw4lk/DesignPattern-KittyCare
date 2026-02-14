package creational.builder;
public class BookingTest {
    public static void main(String[] args) {
        System.out.println("--- Memulai Pengujian Builder Pattern KittyCare ---");

        Booking bookingLengkap = new Booking.BookingBuilder()
                .setDate("2023-11-15")
                .setService("Grooming Lengkap")
                .setNote("Kucing agak sensitif di bagian telinga")
                .build();

        System.out.println("Booking 1 (Lengkap): " + bookingLengkap);

        Booking bookingSederhana = new Booking.BookingBuilder()
                .setDate("2023-11-20")
                .setService("Penitipan Harian")
                .build();

        System.out.println("Booking 2 (Sederhana): " + bookingSederhana);
    }
}