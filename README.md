# 🐾 KittyCare: Pet Care Management System

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Build](https://img.shields.io/badge/Build-Passing-brightgreen?style=for-the-badge)
![Design Patterns](https://img.shields.io/badge/Design%20Patterns-9%20Patterns-blue?style=for-the-badge)
![License](https://img.shields.io/badge/License-MIT-yellow?style=for-the-badge)

**KittyCare** adalah sistem manajemen layanan perawatan hewan peliharaan yang dirancang dengan arsitektur perangkat lunak yang kokoh. Proyek ini mendemonstrasikan implementasi **9 Design Patterns** untuk menciptakan kode yang *scalable*, *maintainable*, dan *clean*.

---

## 🚀 Fitur Utama
- **Manajemen Database Terpusat**: Menggunakan koneksi tunggal untuk efisiensi.
- **Sistem Pemesanan Fleksibel**: Mendukung berbagai jenis layanan (Grooming, Medical, Boarding).
- **Integrasi Pembayaran**: Siap dihubungkan dengan pihak ketiga (Midtrans).
- **Layanan Dinamis**: Memungkinkan penambahan fitur ekstra (Vitamin, Styling) tanpa mengubah kode inti.
- **Notifikasi Otomatis**: Menjaga komunikasi antara Admin dan Pelanggan.

---

## 🏗️ Struktur Arsitektur (Design Patterns)

Proyek ini dibagi menjadi tiga kategori utama pola desain:

### 1. Creational Patterns (Penciptaan)
* 🏠 **Singleton**: `DatabaseConnection` – Menjamin satu koneksi database untuk seluruh aplikasi.
* 🏭 **Factory**: `ServiceFactory` – Menciptakan objek layanan tanpa mengekspos logika instansiasi.
* 🏗️ **Builder**: `Booking` – Membangun objek pemesanan yang kompleks dengan cara yang terbaca (*fluent interface*).

### 2. Structural Patterns (Struktural)
* 🔗 **Adapter**: `MidtransAdapter` – Menghubungkan standar internal dengan sistem pembayaran pihak ketiga.
* 🎨 **Decorator**: `GroomingDecorator` – Menambahkan biaya/fitur tambahan secara dinamis pada saat *runtime*.
* 📦 **Facade**: `BookingFacade` – Menyederhanakan alur kerja yang rumit menjadi satu titik akses.

### 3. Behavioral Patterns (Perilaku)
* 🔔 **Observer**: `NotificationSystem` – Mengirim notifikasi otomatis ke banyak pengamat saat status berubah.
* 🎯 **Strategy**: `PaymentStrategy` – Memungkinkan pertukaran metode pembayaran (COD, Transfer, E-Wallet) secara fleksibel.
* 🔄 **State**: `BookingState` – Mengubah perilaku objek berdasarkan status pesanan (Pending, Paid, Processing).

---

## 📁 Struktur Folder
```text
/
├── creational/
│   ├── singleton/
│   ├── factory/
│   └── builder/
├── structural/
│   ├── adapter/
│   ├── decorator/
│   └── facade/
├── behavioral/
│   ├── observer/
│   ├── strategy/
│   └── state/
└── Main.java (Entry Point)

```

## 🚀 Cara Menjalankan Program

Ikuti langkah-langkah berikut untuk melakukan kompilasi dan menjalankan sistem KittyCare melalui terminal atau command prompt.

### 1. Persiapan Lingkungan

Pastikan perangkat telah terinstal Java Development Kit (JDK) versi 8 atau yang lebih baru.

Verifikasi instalasi dengan perintah berikut:

```bash
java -version
```

---

### 2. Kompilasi Kode Sumber

Proyek ini menggunakan struktur package untuk mengelompokkan pola desain. Gunakan perintah berikut untuk mengompilasi seluruh file `.java` ke dalam satu folder output, misalnya folder `bin`.

#### Untuk pengguna Windows (Command Prompt atau PowerShell):

```bash
javac -d bin Main.java creational/**/*.java structural/**/*.java behavioral/**/*.java
```

#### Untuk pengguna Linux atau macOS:

```bash
javac -d . behavioral/*/*.java structural/*/*.java creational/*/*.java Main.java
```

---

### 3. Eksekusi Aplikasi

Setelah proses kompilasi berhasil, jalankan kelas utama dengan perintah berikut:

```bash
java Main
```

---

## 🧪 Hasil Pengujian

Saat aplikasi dijalankan, kelas `Main` akan mengeksekusi integrasi dari sembilan design pattern secara berurutan. Berikut contoh output pada konsol:

```
=== SINGLETON ===
Connected to database...

=== FACTORY METHOD ===
Grooming service executed

=== BUILDER ===
Booking created: 12 Feb 2026 | Grooming | Kucing Persia

=== ADAPTER ===
Payment via Midtrans: 150000

=== DECORATOR ===
Basic grooming cost
+ Vitamin treatment

=== FACADE ===
Checking schedule...
Processing payment...
Saving booking...
Sending notification...

=== OBSERVER ===
User notified: Booking baru dibuat
Admin notified: Booking baru masuk

=== STRATEGY ===
Transfer payment: 200000

=== STATE ===
Booking Pending
```

---

## 🛠️ Analisis Implementasi

Penerapan Design Pattern pada domain KittyCare memberikan beberapa manfaat utama:

### 1. Decoupling
Setiap komponen seperti sistem pembayaran dan notifikasi berdiri secara independen sehingga perubahan pada satu modul tidak memengaruhi modul lainnya.

### 2. Extensibility
Penambahan layanan atau metode pembayaran baru cukup dilakukan dengan menambahkan kelas baru tanpa memodifikasi kode yang sudah ada, sesuai dengan prinsip Open Closed Principle.

### 3. Readability
Struktur kode menjadi lebih terorganisir sehingga alur kerja sistem mudah dipahami dan dipelihara oleh pengembang lain.

---

## 👥 Kontributor

Laporan dan implementasi disusun oleh Kelompok the clean coders:

- [Muhammad Zaki Fawwaz] – 10122159
- [Natha Widya Putra Nugraha] – 10122187
- [Hilwa Alia] – 10122509

---

## 📄 Lisensi

Proyek ini menggunakan lisensi MIT. Anda bebas menggunakan, memodifikasi, dan mendistribusikan kode untuk tujuan pembelajaran.
