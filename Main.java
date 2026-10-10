import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membuat objek Customer baru
        Customer customer = new Customer("Dian,", "Lala");
        
        // Menambahkan beberapa akun awal (misal: Tabungan & Deposito)
        customer.addAccount(new Account(500000.0)); // Akun 0 (Saldo awal 500rb)
        customer.addAccount(new Account(1000000.0)); // Akun 1 (Saldo awal 1jt)

        int pilihan;
        do {
            System.out.println("\n=================================");
            System.out.println("  SISTEM PERBANKAN SEDERHANA     ");
            System.out.println("=================================");
            System.out.println("Nasabah : " + customer.getFirstName() + " " + customer.getLastName());
            System.out.println("Jumlah Akun Terdaftar: " + customer.getNumOfAccounts());
            System.out.println("1. Cek Saldo Semua Akun");
            System.out.println("2. Setor Tunai (Deposit)");
            System.out.println("3. Tarik Tunai (Withdraw)");
            System.out.println("4. Tambah Akun Baru");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu (0-4): ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("\n--- Daftar Saldo Akun ---");
                    for (int i = 0; i < customer.getNumOfAccounts(); i++) {
                        System.out.println("Akun ke-" + (i + 1) + " : Rp " + customer.getAccount(i).getBalance());
                    }
                    break;

                case 2:
                    System.out.print("Pilih nomor akun (1 s.d. " + customer.getNumOfAccounts() + "): ");
                    int accIndexDep = scanner.nextInt() - 1;
                    Account targetAccDep = customer.getAccount(accIndexDep);
                    if (targetAccDep != null) {
                        System.out.print("Masukkan jumlah setoran: Rp ");
                        double jumlahDep = scanner.nextDouble();
                        if (targetAccDep.deposit(jumlahDep)) {
                            System.out.println("Setoran berhasil! Saldo sekarang: Rp " + targetAccDep.getBalance());
                        } else {
                            System.out.println("Gagal setor. Jumlah harus lebih dari 0.");
                        }
                    } else {
                        System.out.println("Akun tidak ditemukan!");
                    }
                    break;

                case 3:
                    System.out.print("Pilih nomor akun (1 s.d. " + customer.getNumOfAccounts() + "): ");
                    int accIndexWit = scanner.nextInt() - 1;
                    Account targetAccWit = customer.getAccount(accIndexWit);
                    if (targetAccWit != null) {
                        System.out.print("Masukkan jumlah penarikan: Rp ");
                        double jumlahWit = scanner.nextDouble();
                        if (targetAccWit.withdraw(jumlahWit)) {
                            System.out.println("Penarikan berhasil! Sisa saldo: Rp " + targetAccWit.getBalance());
                        } else {
                            System.out.println("Gagal tarik tunai. Saldo tidak mencukupi atau nominal tidak valid.");
                        }
                    } else {
                        System.out.println("Akun tidak ditemukan!");
                    }
                    break;

                case 4:
                    System.out.print("Masukkan saldo awal untuk akun baru: Rp ");
                    double saldoAwal = scanner.nextDouble();
                    customer.addAccount(new Account(saldoAwal));
                    System.out.println("Akun baru berhasil ditambahkan!");
                    break;

                case 0:
                    System.out.println("Terima kasih telah menggunakan layanan perbankan.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 0);

        scanner.close();
    }
}