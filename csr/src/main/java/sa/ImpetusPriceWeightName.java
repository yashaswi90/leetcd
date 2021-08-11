package sa;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ImpetusPriceWeightName {

    public static void main(String[] args) {

        ImpetusPriceWeightName is = new ImpetusPriceWeightName();
        List<Product> list = new ArrayList<>();
        list.add(new Product("ball", 2, 1));
        list.add(new Product("box", 2, 2));
        list.add(new Product("ball", 2, 1));
        list.add(new Product("box", 2, 1));
        list.add(new Product("ball", 2, 1));


        System.out.println(numberDuplicates(list));
    }

    private static int numberDuplicates(List<Product> list) {
        HashSet<String> set = new HashSet<>();
        int count = 0;
        for (Product s : list) {
            String key = String.format("%s-%s-%s", s.getName(), s.getPrice(), s.getWeight());
            if (!set.contains(key)) {
                set.add(key);
            } else {
                count++;
            }
        }
        return count;
    }
}


class Product {
    private String name;
    private int price;
    private int weight;

    public Product(String name, int price, int weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                '}';
    }
}

