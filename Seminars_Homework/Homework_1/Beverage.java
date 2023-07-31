package Seminars_Homework.Homework_1;

import java.util.Calendar;

public class Beverage extends Product {

    Double volume;

    public Beverage (String name, int price, int quantity, Calendar bestBefore, Double volume) {
        super(name, price, quantity, bestBefore);
        this.volume = volume;
    }

    public Double getVolume() {
        return volume;
    }

    // public void setVolume(double volume) {
    //     this.volume = volume;
    // }

    @Override
    public String toString() {
        return "\nProduct Beverage: [name=" + name + ", price=" + price + ", quantity=" + quantity + "volume=" + volume + ", bestBefore=" + bestBefore.get(Calendar.YEAR) + "/" + bestBefore.get(Calendar.MONTH) + "]";
    }
}
