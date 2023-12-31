// Реализуйте класс Товар, содержащий данные о товаре, и ТорговыйАвтомат, содержащий в себе методы
// initProducts (List <Product>) сохраняющий в себе список исходных продуктов и getProduct(String name)


package Seminars_Homework.Homework_1;

import java.util.ArrayList;
import java.util.List;

public class Vending {
    
    List<Product> listProduct = new ArrayList<>();

    public void initProducts(List<Product> myList) {
        listProduct = myList;
    }

    public Product getProduct(String name) {
        for (Product product : listProduct) {
            if(product.getName().equals(name)) {
                return product;
            }
        }return null;
    }

}
