//  Part C: Stream Operations on Product Dataset

import java.util.*;
import java.util.stream.*;
import java.util.function.*;
import java.util.Map.Entry;

class Product {
    String name;
    double price;
    String category;

    Product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String toString() {
        return name + " - " + category + " - ₹" + price;
    }
}

public class ProductStream {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product("Laptop", 75000, "Electronics"),
            new Product("Phone", 50000, "Electronics"),
            new Product("Shirt", 1500, "Clothing"),
            new Product("Jeans", 2000, "Clothing"),
            new Product("Fridge", 30000, "Appliances"),
            new Product("Oven", 10000, "Appliances")
        );

        Map<String, List<Product>> grouped = products.stream()
            .collect(Collectors.groupingBy(p -> p.category));

        System.out.println("Grouped by Category:");
        grouped.forEach((cat, items) -> {
            System.out.println(cat);
            items.forEach(System.out::println);
        });

        System.out.println("\nMost Expensive Product in Each Category:");
        Map<String, Optional<Product>> maxPrice = products.stream()
            .collect(Collectors.groupingBy(p -> p.category,
                Collectors.maxBy(Comparator.comparingDouble(p -> p.price))));

        maxPrice.forEach((cat, prod) -> {
            System.out.println(cat + ": " + prod.get());
        });

        double avgPrice = products.stream()
            .collect(Collectors.averagingDouble(p -> p.price));

        System.out.println("\nAverage Price of All Products: ₹" + avgPrice);
    }
}
