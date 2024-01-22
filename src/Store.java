import com.workintech.store.model.Bread;
import com.workintech.store.model.Chocolate;
import com.workintech.store.model.Coke;
import com.workintech.store.model.ProductForSale;

public class Store {
    public static void main(String[] args) {
        ProductForSale[] products = new ProductForSale[5];
        products[0] = new Chocolate("Sweet", 13.4, "Chocolate Object", "White", Boolean.TRUE);
        products[1] = new Bread("Bakery", 5, "Bread Object", "Einkorn", "Brown");
        products[2] = new Coke("Drinks", 15, "Coke Object", Boolean.TRUE, 2.5);
        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products){
            if(product!=null){
                product.showDetails();
            }
        }

    }
}