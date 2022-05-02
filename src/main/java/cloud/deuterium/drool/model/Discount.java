package cloud.deuterium.drool.model;

/**
 * Created by Milan Stojkovic 26-Apr-2022
 */

public class Discount {
    private int discount;

    public Discount() {
    }

    public Discount(int discount) {
        this.discount = discount;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
}
