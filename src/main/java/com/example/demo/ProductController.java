package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {
    private List<Product> products = new ArrayList<>();

    public ProductController() {
        products.addAll(List.of(
                new Product(1, "Product 1", "Category 1", "Product 1 Category 1", 100),
                new Product(1, "Product 2", "Category 2", "Product 2 Category 2", 1000),
                new Product(1, "Product 3", "Category 1", "Product 4 Category 1", 200),
                new Product(1, "Product 4", "Category 2", "Product 5 Category 2", 400),
                new Product(1, "Product 5", "Category 3", "Product 6 Category 3", 10),
                new Product(1, "Product 6", "Category 4", "Product 7 Category 4", 100.10),
                new Product(1, "Product 7", "Category 1", "Product 8 Category 1", 33.22),
                new Product(1, "Product 8", "Category 2", "Product 9 Category 2", 78.93),
                new Product(1, "Product 9", "Category 3", "Product 10 Category 3", 1330),
                new Product(1, "Product 9", "Category 10", "Product 10 Category 10", 1330)
        ));
    }

    @RequestMapping(value = "/products", method = RequestMethod.GET)
    //@GetMapping("/products")
    Iterable<Product> getProducts() {
        return products;
    }

    @PostMapping("/products")
    Product postProduct(@RequestBody Product product) {
        products.add(product);
        return product;
    }

    @PutMapping("/products/{id}")
    Product putProduct(@PathVariable int id, @RequestBody Product product) {
        int productIndex = -1;

        for (Product p: products) {
            if (p.getId() == id) {
                productIndex = products.indexOf(p);
                products.set(productIndex, product);
            }
        }

        return (productIndex == -1) ? postProduct(product) : product;
    }
}
