package com.workintech.store.sale;

import com.workintech.store.sale.Bread;
import com.workintech.store.sale.Chocolate;
import com.workintech.store.sale.Coke;
import com.workintech.store.sale.ProductForSale;

public class Store {
    public static void main(String[] args) {
        ProductForSale[] products = new ProductForSale[5];
        products[0] = new Chocolate("Sweet", 13.4, "Chocolate Object", "White", Boolean.TRUE);
        products[1] = new Bread("Bakery", 5, "Bread Object", "Einkorn", "Brown");
        products[2] = new Coke("Drinks", 15, "Coke Object", Boolean.TRUE, 2.5);
        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products){ //arrayi gez
            if(product!=null){ //NullPointerException hatasini önler
                product.showDetails();
            }
        }

    }
}