package Seminars.Seminar_1;


import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        
        
        Beverage beverage1 = new HotBeverage("Green tea", 20, 2, new GregorianCalendar(2023, 8, 20), 0.25, 60);
        Product beverage2 = new HotBeverage("Black tea", 20, 10, new GregorianCalendar(2023, 8, 10), 0.25, 65);
        HotBeverage beverage3 = new HotBeverage("Coffe", 40, 5, new GregorianCalendar(2023, 8, 15), 0.3, 60);

 
        List<Product> list_prod = new ArrayList<>();

        list_prod.add(beverage1);
        list_prod.add(beverage2);
        list_prod.add(beverage3);

        Vending hotBeverageVending = new HotBeverageVen();
        hotBeverageVending.initProducts(list_prod);

        String name = "Green tea";
        Double volume = 0.25;
        Integer temperature = 60;

        System.out.println(((HotBeverageVen) hotBeverageVending).getProduct(name, volume, temperature).toString());
        
    }    
}
