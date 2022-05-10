package application;

import entities.Product;

import java.util.ArrayList;
import java.util.List;

public class ObjetoPrimeiraOrdemOuPrimeiraClasse {

    public static int compareProducts(Product p1, Product p2){
        return p1.getPrice().compareTo(p2.getPrice());
    }

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("tv", 900.00));
        list.add(new Product("cel", 800.00));
        list.add(new Product("tablet", 100.00));

        list.sort(ObjetoPrimeiraOrdemOuPrimeiraClasse::compareProducts);

        list.forEach(System.out::println);

    }

}
