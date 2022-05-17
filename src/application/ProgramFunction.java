package application;

import entities.Product;
import util.UpperCaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class ProgramFunction {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 700.00));
        list.add(new Product("Notebook", 10.00));
        list.add(new Product("Tablet", 100.00));
        list.add(new Product("mouse", 1.00));
        list.add(new Product("monistor", 1000.00));

        List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());

        names.forEach(System.out::println);

    }

}
