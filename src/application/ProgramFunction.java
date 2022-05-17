package application;

import entities.Product;
import util.UpperCaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ProgramFunction {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("arsrasrasrsarsars", 700.00));
        list.add(new Product("Notebook", 10.00));
        list.add(new Product("Tablet", 100.00));
        list.add(new Product("mouse", 1.00));
        list.add(new Product("ronistor", 1000.00));

        Function<Product, String> func = p -> p.getName().toUpperCase();

        List<String> names = list.stream().map(func).collect(Collectors.toList());

        names.forEach(System.out::println);

    }

}
