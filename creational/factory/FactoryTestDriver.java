package creational.factory;
public class FactoryTestDriver {
    public static void main(String[] args) {
        System.out.println("--- Memulai Pengujian Factory Pattern KittyCare ---");

        Service layanan1 = ServiceFactory.createService("grooming");
        if (layanan1 != null) {
            layanan1.execute();
        }

        Service layanan2 = ServiceFactory.createService("medical");
        if (layanan2 != null) {
            layanan2.execute();
        }

        Service layanan3 = ServiceFactory.createService("training");
        if (layanan3 == null) {
            System.out.println("Info: Layanan 'training' belum tersedia di sistem.");
        }
    }
}