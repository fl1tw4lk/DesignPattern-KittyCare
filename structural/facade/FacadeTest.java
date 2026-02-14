package structural.facade;
public class FacadeTest {
    public static void main(String[] args) {
        System.out.println("--- Memulai Pengujian Facade Pattern KittyCare ---");

        BookingFacade portalPemesanan = new BookingFacade();

        System.out.println("Klien: Saya ingin memproses pemesanan ini.");
        portalPemesanan.processBooking();

        System.out.println("\n--- Hasil Verifikasi ---");
        System.out.println("Seluruh subsistem berhasil diaktifkan melalui satu gerbang utama.");
    }
}