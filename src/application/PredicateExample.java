package application;

import entities.Product;
import util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class PredicateExample {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));
        list.add(new Product("mouse", 50.00));
        list.add(new Product("monitor", 1.00));

        list.removeIf(Product::staticProductPredicate);

        for (Product p:list) {
            System.out.println(p);
        }

    }

}
