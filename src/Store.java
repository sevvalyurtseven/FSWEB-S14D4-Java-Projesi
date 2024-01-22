import com.workintech.store.model.ProductForSale;

public class Store {
    public static void main(String[] args) {

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