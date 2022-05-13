package application;

import entities.Product;
import util.PriceUpdate;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ProgramConsumer {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 700.00));
        list.add(new Product("Notebook", 10.00));
        list.add(new Product("Tablet", 100.00));
        list.add(new Product("mouse", 1.00));
        list.add(new Product("monistor", 1000.00));

        list.forEach(Product::staticPriceUpdate);

        list.forEach(System.out::println);

    }

}
