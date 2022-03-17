//Assignment 2

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class FuPrice{
    String name;
    int price;

    public FuPrice(String name,int price) {
        this.price = price;
        this.name = name;
    }

}

public class Example {
    public static void main(String[] args) {
        List<FuPrice> fuList = new ArrayList<FuPrice>();
        //Adding Products
        fuList.add(new FuPrice("apple", 150));
        fuList.add(new FuPrice("lemon", 100));
        fuList.add(new FuPrice("strawberry", 500));
        List<String> FuPriceList =
                fuList.stream()
                        .filter(f -> f.price>100)
                        .map(x -> x.name)
                        .collect(Collectors.toList());  // collecting  list
        System.out.println(FuPriceList);

    }
}
