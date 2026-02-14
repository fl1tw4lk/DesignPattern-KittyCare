package structural.adapter;
public class AdapterTest {
    public static void main(String[] args) {
        System.out.println("--- Memulai Pengujian Adapter Pattern KittyCare ---");

        PaymentAdapter gatewayPembayaran = new MidtransAdapter();

        System.out.println("Memproses pembayaran layanan...");
        gatewayPembayaran.pay(150000);

        System.out.println("\n--- Hasil Verifikasi ---");
        System.out.println("Sistem berhasil memanggil layanan pihak ketiga melalui antarmuka standar internal.");
    }
}