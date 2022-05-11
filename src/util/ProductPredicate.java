package util;

import entities.Product;

import java.util.function.Predicate;

public class ProductPredicate implements Predicate<Product> {

    @Override  //"Uma interface funcional = Apenas um Metodo implementado"
    public boolean test(Product p) {
        return p.getPrice() >= 100.00;
    }
}
