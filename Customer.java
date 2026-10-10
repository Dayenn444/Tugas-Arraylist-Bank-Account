import java.util.ArrayList;

public class Customer {
    private String firstName;
    private String lastName;
    private ArrayList<Account> accounts; // Menggunakan ArrayList untuk menampung akun

    // Constructor menerima firstName dan lastName
    public Customer(String f, String l) {
        this.firstName = f;
        this.lastName = l;
        this.accounts = new ArrayList<Account>();
    }

    // Accessor untuk firstName
    public String getFirstName() {
        return firstName;
    }

    // Accessor untuk lastName
    public String getLastName() {
        return lastName;
    }

    // Method untuk menambahkan akun ke ArrayList accounts
    public void addAccount(Account acct) {
        this.accounts.add(acct);
    }

    // Method untuk mengambil daftar akun (atau bisa mengembalikan akun berdasarkan index)
    public Account getAccount(int index) {
        if (index >= 0 && index < accounts.size()) {
            return accounts.get(index);
        }
        return null;
    }

    // Method opsional untuk melihat total jumlah akun yang dimiliki customer
    public int getNumOfAccounts() {
        return accounts.size();
    }
}
