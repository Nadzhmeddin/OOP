// Реализуйте класс Товар, содержащий данные о товаре, и ТорговыйАвтомат, содержащий в себе методы
// initProducts (List <Product>) сохраняющий в себе список исходных продуктов и getProduct(String name)

package Seminars.Seminar_1 ;

import java.util.Calendar;

public abstract class Product {
    
    private String name;
    private int price;
    private int quantity;
    private Calendar bestBefore;
    // int [] storage;

    public Product(String name, int price, int quantity, Calendar bestBefore) {
        this.name = name ;
        this.price = price;
        this.quantity = quantity;
        this.bestBefore = bestBefore; 
    }

    public String getName() {
        return name;
    }  

    public int getPrice() {
        return price;
    }

    public Calendar getBestBefore() {
        return bestBefore;
    }
        
    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setBestBefore(Calendar bestBefore) {
        this.bestBefore = bestBefore;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + ", quantity=" + quantity + ", bestBefore=" + bestBefore.get(Calendar.YEAR) + "/" + bestBefore.get(Calendar.MONTH) + "]";
    }
    
}