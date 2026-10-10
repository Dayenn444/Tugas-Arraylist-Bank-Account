Struktur Program
Proyek ini terdiri dari tiga file kelas utama:
1. Account.java: Merepresentasikan rekening bank individual yang menyimpan atribut saldo (balance) serta menyediakan fungsi dasar seperti deposit() (setor tunai), withdraw() (tarik tunai), dan getBalance().
2. Customer.java: Merepresentasikan nasabah yang memiliki informasi nama depan (firstName), nama belakang (lastName), serta daftar rekening menggunakan ArrayList<Account> (accounts).
3. Main.java: Berisi fungsi utama (main) yang dilengkapi dengan antarmuka menu konsol interaktif (simulasi ATM sederhana) menggunakan java.util.Scanner untuk menguji fungsi kelas Account dan Customer secara langsung.
  
Fitur Program
1. Manajemen Rekening Jamak (Multi-Account): Satu objek Customer dapat memiliki lebih dari satu Account berkat penerapan ArrayList.
2. Cek Saldo: Menampilkan daftar seluruh saldo dari akun-akun yang dimiliki oleh nasabah.
3. Setor Tunai (Deposit): Menambah saldo pada akun tertentu yang dipilih.
4. Tarik Tunai (Withdraw): Mengurangi saldo dengan validasi keamanan agar saldo tidak kurang dari nominal yang ditarik.
5. Tambah Akun Baru: Memungkinkan penambahan akun rekening baru secara dinamis saat program berjalan.

Cara Menjalankan Program
1. Pastikan komputer Anda sudah terinstal Java Development Kit (JDK).
2. Clone repository ini atau simpan ketiga file (Account.java, Customer.java, dan Main.java) di dalam satu folder yang sama.
3. Buka terminal atau Command Prompt di direktori folder tersebut.Kompilasi file Java menggunakan perintah: javac Account.java Customer.java Main.java
4. Jalankan program dengan perintah: java Main
