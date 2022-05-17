package model.service;
import entities.Product;
import java.util.List;
import java.util.function.Predicate;

// Funcoes que recebem funcoes como argumento//
//Calcular soma dos precos dos produtos que comecam com T
public class ProductService {

    public double filterSum(List<Product> list, Predicate<Product> criteria) {
        double sum = 0.0;
        for(Product p : list){
            if (criteria.test(p)){
            //if(p.getName().charAt(0) == 'T'){
                sum += p.getPrice();
            }
        }
        return sum;
    }
}

