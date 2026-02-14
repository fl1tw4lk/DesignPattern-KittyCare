package behavioral.observer;
public class ObserverTest {
    public static void main(String[] args) {
        System.out.println("--- Memulai Pengujian Observer Pattern KittyCare ---");

        Observer pelanggan = new UserNotification();
        Observer admin = new AdminNotification();

        System.out.println("Sistem: Mengirim notifikasi status 'Siap Dijemput'...");

        pelanggan.update("Siap Dijemput");
        admin.update("Siap Dijemput");

        System.out.println("\n--- Hasil Verifikasi ---");
        System.out.println("Seluruh pengamat menerima pembaruan.");
    }
}
