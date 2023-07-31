package Seminars_Homework.Homework_1;

import java.util.Calendar;

public class Food extends Product {

    double weight;

    public Food(String name, int price, int quantity, Calendar bestBefore, double weight) {
        super(name, price, quantity, bestBefore);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    // public void setWeight(double weight) {
    //     this.weight = weight;
    // }
    
    @Override
    public String toString() {
        return "\nProduct foods: [name=" + name + ", price=" + price + ", quantity=" + quantity + "weight=" + weight + ", bestBefore=" + bestBefore.get(Calendar.YEAR) + "/" + bestBefore.get(Calendar.MONTH) + "]";
    }
    
}
