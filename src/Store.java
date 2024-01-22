import com.workintech.store.model.Bread;
import com.workintech.store.model.Chocolate;
import com.workintech.store.model.Coke;
import com.workintech.store.model.ProductForSale;

public class Store {
    public static void main(String[] args) {
        ProductForSale[] product = new ProductForSale[5];
        product[0] = new Chocolate("Sweet", 13.4, "Chocolate Object", "White", Boolean.TRUE);
        product[1] = new Bread("Bakery", 5, "Bread Object", "Einkorn", "Brown");
        product[2] = new Coke("Drinks", 15, "Coke Object", Boolean.TRUE, 2.5);


        listProducts();
    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products){
            if(product!=null){
                product.showDetails();
            }
        }

    }
}