public class Main {
    public static void main(String[] args) {
        Customer a = new Customer();
        System.out.println("Name: " + a.getName() + " Email: " + a.getEmailAddress() + "Credit Limit: " + a.getCreditLimit());

        Customer b = new Customer("Kinjal", "kinjal@gmail.com");
        System.out.println("Name: " + b.getName() + " Email: " + b.getEmailAddress() + "Credit: " + b.getCreditLimit());

        Customer c = new Customer("Kinjal", 2000, "kinjal@gmail.com");
        System.out.println("Name: " + c.getName() + " Email: " + c.getEmailAddress() + "Credit: " + c.getCreditLimit());
    }
}