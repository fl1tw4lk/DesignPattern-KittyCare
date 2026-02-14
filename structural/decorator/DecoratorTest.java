package structural.decorator;
public class DecoratorTest {
    public static void main(String[] args) {
        System.out.println("--- Memulai Pengujian Decorator Pattern KittyCare ---");

        System.out.println("Pesanan A:");
        Grooming pesananA = new BasicGrooming();
        pesananA.cost();

        System.out.println("\nPesanan B (Lengkap):");
        Grooming pesananB = new BasicGrooming();
        pesananB = new VitaminDecorator(pesananB); 
        pesananB = new StylingDecorator(pesananB); 
        pesananB.cost();

        System.out.println("\n--- Hasil Verifikasi ---");
        System.out.println("Sistem berhasil menambahkan fitur secara dinamis tanpa mengubah kelas dasar.");
    }
}