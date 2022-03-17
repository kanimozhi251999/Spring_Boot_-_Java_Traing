import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterExample {
    public static void main(String[] args) {

        // traditional way
        List < Product > list = new ArrayList < Product > ();

        for (Product product: getProducts()) {
            if (product.getPrice() > 30000) {
                list.add(product);
            }
        }

        for (Product product: list) {
            System.out.println(product);
        }
    }

    private static List< Product > getProducts() {
        List < Product > productsList = new ArrayList< Product >();
        productsList.add(new Product(1, "HP Laptop", 25000));
        productsList.add(new Product(2, "Dell Laptop", 30000));
        productsList.add(new Product(5, "Apple Laptop", 90000));
        return productsList;
    }


}
