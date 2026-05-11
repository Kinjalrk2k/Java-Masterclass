public class Main {
    public static void main(String[] args) {
//        BankAccount account = new BankAccount("696969696969", 10,
//                "Kinjal", "kinjal@gmail.com", "8372947398");
        BankAccount account = new BankAccount();
//        account.setCustomerName("Kinjal");
//        account.setAccountNumber("696969696969");
//        account.setEmail("kinja@gmail.com");
//        account.setPhoneNumber("8372947398");
//        account.setAccountBalance(10);

        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Balance: " + account.getAccountBalance());

        account.depositFund(100);
        System.out.println("Amount after deposit: " + account.getAccountBalance());

        account.withdrawFund(1000);
        System.out.println("Amount after deposit: " + account.getAccountBalance());

        account.withdrawFund(20);
        System.out.println("Amount after deposit: " + account.getAccountBalance());

        BankAccount timsAccount = new BankAccount("Tim", "tim@gmail.com", "4738928303");
        System.out.println("Account Number: " + timsAccount.getAccountNumber());
        System.out.println("Customer Name: " + timsAccount.getCustomerName());
    }
}