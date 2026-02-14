public class StateTest {
    public static void main(String[] args) {
        System.out.println("--- Memulai Pengujian State Pattern KittyCare ---");

        // Membuat objek pemesanan (Konteks)
        BookingContext pesananKucing = new BookingContext();

        // 1. Status Awal: Pending
        pesananKucing.setState(new PendingState());
        pesananKucing.applyStatus();

        // 2. Transisi Status ke: Paid
        System.out.println("--- Transisi status terjadi ---");
        pesananKucing.setState(new PaidState());
        pesananKucing.applyStatus();

        // 3. Transisi Status ke: Processing
        System.out.println("--- Transisi status terjadi ---");
        pesananKucing.setState(new ProcessingState());
        pesananKucing.applyStatus();

        System.out.println("\n--- Hasil Verifikasi ---");
        System.out.println("Objek berhasil mengubah perilakunya sesuai dengan perubahan status internalnya.");
    }
}