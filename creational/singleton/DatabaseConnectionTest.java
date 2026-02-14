package creational.singleton;
public class DatabaseConnectionTest {
    public static void main(String[] args) {
        System.out.println("--- Memulai Pengujian Singleton ---");

        System.out.println("Permintaan ke-1:");
        DatabaseConnection koneksiSatu = DatabaseConnection.getInstance();
        koneksiSatu.connect();

        System.out.println("\nPermintaan ke-2:");
        DatabaseConnection koneksiDua = DatabaseConnection.getInstance();
        koneksiDua.connect();

        System.out.println("\n--- Hasil Verifikasi ---");
        if (koneksiSatu == koneksiDua) {
            System.out.println("SUKSES: Kedua variabel merujuk pada instance objek yang sama persis.");
            System.out.println("Singleton Pattern terbukti berfungsi.");
        } else {
            System.out.println("GAGAL: Terdeteksi dua instance objek yang berbeda.");
        }
    }
}