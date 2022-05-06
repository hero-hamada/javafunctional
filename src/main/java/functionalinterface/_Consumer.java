package functionalinterface;

public class _Consumer {

    public static void main(String[] args) {
        greetCustomer(new Customer("Senku", "99999"));
    }

    static void greetCustomer(Customer customer) {
        System.out.format("Hello %s, thanks! phone number %s", customer.customerName, customer.customerPhoneNumber);
    }

    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
