public class StrategyTest {
    public static void main(String[] args) {
        System.out.println("--- Memulai Pengujian Strategy Pattern KittyCare ---");

        int totalBiaya = 200000;

        PaymentStrategy strategiPilihan = new TransferPayment();
        System.out.println("Pelanggan memilih Transfer Bank:");
        strategiPilihan.pay(totalBiaya);

        System.out.println("\nPelanggan berubah pikiran dan memilih E-Wallet:");
        strategiPilihan = new EWalletPayment();
        strategiPilihan.pay(totalBiaya);

        System.out.println("\n--- Hasil Verifikasi ---");
        System.out.println("Sistem berhasil menukarkan algoritma pembayaran secara dinamis pada saat runtime.");
    }
}