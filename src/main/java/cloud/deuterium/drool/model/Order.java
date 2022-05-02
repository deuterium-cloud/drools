package cloud.deuterium.drool.model;

/**
 * Created by Milan Stojkovic 26-Apr-2022
 */

public class Order {

    private int quantity;
    private String item;
    private int discount;
    private CustomerType customerType;

    public Order() {
    }

    public Order(int quantity, String item, int discount, CustomerType customerType) {
        this.quantity = quantity;
        this.item = item;
        this.discount = discount;
        this.customerType = customerType;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }
}
