public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setCustomerName("Kinjal");
        account.setAccountNumber("696969696969");
        account.setEmail("kinja@gmail.com");
        account.setPhoneNumber("8372947398");
        account.setAccountBalance(10);

        account.depositFund(100);
        System.out.println("Amount after deposit: " + account.getAccountBalance());

        account.withdrawFund(1000);
        System.out.println("Amount after deposit: " + account.getAccountBalance());

        account.withdrawFund(20);
        System.out.println("Amount after deposit: " + account.getAccountBalance());
    }
}