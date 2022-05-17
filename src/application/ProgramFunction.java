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
        list.add(new Product("asasasas", 10.00));
        list.add(new Product("tftftftft", 100.00));
        list.add(new Product("hdhdhdhd", 1.00));
        list.add(new Product("televisor", 1000.00));

        List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());

        names.forEach(System.out::println);

    }

}
