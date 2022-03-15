package Store;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<IBuyable> products = new ArrayList<>();
        Product product1 = new Product(1, "Shoe", 5);
        Product product2 = new Product(2, "Cloth", 5);
        products.add(product1);
        products.add(product2);
        for (IBuyable product:products) {
            System.out.println(product.getName());
        }
    }
}
