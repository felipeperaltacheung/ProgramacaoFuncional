package application;

import entities.ProductStreamAV;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class ProgramStreamAverageList {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("enter full file path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            List<ProductStreamAV> list = new ArrayList<>();

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                list.add(new ProductStreamAV(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }

            //pipeline p/ achar a soma dos precos
            double avg = list.stream()
                    .map(p -> p.getPrice())
                    .reduce(0.0, (x,y) -> x + y) / list.size(); //somatorio dos precos

            System.out.println("Average price: " + String.format("%.2f", avg));

            //pipeline
            Comparator<String> comp = (s1,s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
            List<String> names = list.stream()
                    .filter(p -> p.getPrice() < avg)
                    .map(p -> p.getName())
                    .sorted(comp.reversed())
                    .collect(Collectors.toList());

            names.forEach(System.out::println);

        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }

}
