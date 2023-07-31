package Seminars.Seminar_1;


import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        
        Product chokolate_1 = new Food("Twix", 70, 10, new GregorianCalendar(2023, 7, 10));
        Product chokolate_2 = new Food("Mars", 75, 25, new GregorianCalendar(2023, 8, 12));
        Product chokolate_3 = new Food("Sneakers", 80, 30, new GregorianCalendar(2023, 8, 9));

        Vending list = new Vending();

        List<Product> list_prod = new ArrayList<>();
        list_prod.add(chokolate_1);
        list_prod.add(chokolate_2);
        list_prod.add(chokolate_3);

        list.initProducts(list_prod);

        String name = "Twix";

        System.out.println(list.getProduct(name).toString());
    }


    
}
