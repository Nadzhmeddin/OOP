package Seminars_Homework.Homework_1;

import java.util.Calendar;

public class HotBeverage extends Beverage {

    Integer temperature;

    public HotBeverage(String name, int price, int quantity, Calendar bestBefore, Double volume, Integer temperature) {
        super(name, price, quantity, bestBefore, volume);
        this.temperature = temperature;
    }

    public Integer getTemperature() {
        return temperature;
    }
    
    // public void setTemperature(Integer temperature) {
    //    this.temperature = temperature;
    // }

    @Override
    public String toString() {
        return "\nProduct Hot Beverage: [name=" + name + ", price=" + price + ", quantity=" + quantity + ", temp= " + temperature + "bestBefore=" + bestBefore.get(Calendar.YEAR) + "/" + bestBefore.get(Calendar.MONTH) + "]";
    }
}
