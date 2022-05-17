package application;

import entities.Product;
import model.service.ProductService;
import java.util.ArrayList;
import java.util.List;


// Funcoes que recebem funcoes como argumento//
//Calcular soma dos precos dos produtos que comecam com T
public class ProgramMineFunction {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 700.00));
        list.add(new Product("Mouse", 10.00));
        list.add(new Product("Tablet", 100.00));
        list.add(new Product("yD", 1.00));
        list.add(new Product("Pendrive", 1000.00));

        ProductService ps = new ProductService();

        double sum = ps.filterSum(list, p -> p.getName().charAt(0) == 'T');

        System.out.println("Sum" + String.format("%.2f", sum));


    }
}
