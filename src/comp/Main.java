// package comp;

// import java.util.*;

// class Product implements Comparable<Product> {
//     String name;
//     double price;

//     public Product(String name, double price) {
//         this.name = name;
//         this.price = price;
//     }

//     @Override
//     public int compareTo(Product other) {
//         return this.name.compareTo(other.name); // Sort products by name
//     }

//     @Override
//     public String toString() {
//         return "Product{name='" + name + "', price=" + price + "}";
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         List<Product> products = new ArrayList<>();
//         products.add(new Product("Banana", 0.99));
//         products.add(new Product("Apple", 1.29));
//         products.add(new Product("Orange", 1.09));

//         Collections.sort(products); // Sort by product name using compareTo()

//         for (Product product : products) {
//             System.out.println(product);
//         }
//     }
// }
