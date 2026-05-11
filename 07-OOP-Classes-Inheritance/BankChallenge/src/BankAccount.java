public class BankAccount {
    private String accountNumber;
    private float accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        this("696969696969", 10,
                "Default Name", "Default Email", "Default Phone");
        System.out.println("Empty constructor called");
    }

    public BankAccount(String accountNumber, float accountBalance, String customerName, String email, String phoneNumber) {
        System.out.println("BankAccount Constructor with parameters called");
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this("999999999", 10, customerName, email, phoneNumber);
//        this.customerName = customerName;
//        this.email = email;
//        this.phoneNumber = phoneNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(float accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public float getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void depositFund(float amount) {
        accountBalance += amount;
    }

    public void withdrawFund(float amount) {
        if (amount <= accountBalance) {
            accountBalance -= amount;
        } else {
            System.out.println("Insufficient funds.");
        }

    }
}
