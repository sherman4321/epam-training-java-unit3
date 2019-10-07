package Unit3.Customer;

public class Shop {
    public static final int N = 5;
    private Customer [] customers;

    public Shop() {
        customers = new Customer[N];
    }

    public Shop(Customer[] customers) {
        this.customers = customers;
    }


    public Customer[] getCustomers() {
        return customers;
    }

    public void setCustomers(Customer[] customers) {
        this.customers = customers;
    }
}
