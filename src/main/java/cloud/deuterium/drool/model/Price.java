package cloud.deuterium.drool.model;

import java.time.LocalDate;

/**
 * Created by Milan Stojkovic 28-Apr-2022
 */
public class Price {
    private int price;
    private LocalDate date = LocalDate.now();

    public Price() {
    }

    public Price(int price, LocalDate date) {
        this.price = price;
        this.date = date;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
