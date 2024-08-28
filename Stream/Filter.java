import java.util.*;
import java.util.stream.Collectors;

public class Filter extends  Product{
    public Filter(int id, String name, float price) {
        super(id, name, price);
    }

    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<Product>();

        productsList.add(new Product(1,"HP Laptop",25000));
        productsList.add(new Product(2,"Dell Laptop",30000));
        productsList.add(new Product(3,"Lenevo Laptop",2800));
        productsList.add(new Product(4,"Sony Laptop",28000));
        productsList.add(new Product(5,"Apple Laptop",90000));
        List<Float> productPriceList2 =productsList.stream()
                .filter(p -> p.price > 30000)
                .map(p->p.price)
                .collect(Collectors.toList());
        System.out.println(productPriceList2);
    }
}