public class java7 {

    private String customerName;
    private int customerId;

    // Default Constructor
    public Customer() {
        customerName = "Unknown";
        customerId = 0;
    }

    // Getter for Customer Name
    public String getCustomerName() {
        return customerName;
    }

    // Setter for Customer Name
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    // Getter for Customer ID
    public int getCustomerId() {
        return customerId;
    }

    // Setter for Customer ID
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
}
