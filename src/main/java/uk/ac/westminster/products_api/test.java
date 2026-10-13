package uk.ac.westminster.products_api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class test {
    static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1L, "Laptop", 899.99));
        products.add(new Product(2L, "Mouse", 24.99));
        Product[] fixed = new Product[2];
        Map<Long, Product> byId = new HashMap<>();
        byId.put(1L, new Product(1L, "Laptop", 899.99));

        products.add(new Product(3L,
                "Mug", 8.50));
        //Product p = products.get(5);
        int n = products.size();
        Product q = byId.get(99L);
        //System.out.println(q.getName());
    }
}
