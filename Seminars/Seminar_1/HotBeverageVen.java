package Seminars.Seminar_1;


import java.util.List;

public class HotBeverageVen extends Vending {
    
    public HotBeverageVen(){
        super();
    }

    @Override
    public void initProducts(List<Product> myList) {
        super.initProducts(myList);
    }

    public HotBeverage getProduct(String name, Double volume, Integer temperature){
        for (Product product : listProduct) {
            if(product instanceof Product & product.getName().equals(name) & ((HotBeverage) product).getTemperature().equals(temperature) & ((HotBeverage) product).getVolume().equals(volume)) {
                return (HotBeverage) product;
            }
        }return null;
    }
}
